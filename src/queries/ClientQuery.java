
package queries;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//This class contains all the methods that contains
//all SQL queries that will be used by the user
//on regular page
public class ClientQuery {
    
    //call the connection to the database
    Connection conn = DBconn.connect();
    
    //this method will be called to add informations to the reservation table
    // from the database and assigns a room for the guests
    public void book(String reservee, String checkindate, int nightstay, int guests, int acc_id, int PackageID, String RoomNo) throws IOException{
   
            try{
                //SQL query that gets the needed values from the database
                String q = "INSERT INTO reservations (`ReserveID`,`Package_ID` ,`AccountNo`,`reservee`,`Date_Reserved`,`check_in`,`check_out`,`night_stay`,`Guests`,`RoomNo`)"
                        + "VALUES(NULL,'"+PackageID+"','"+acc_id+"','"+reservee+"',CURDATE(),'"+checkindate+"', DATE_ADD('"+checkindate+"', INTERVAL "+nightstay+" day) ,'"+nightstay+"','"+guests+"','"+RoomNo+"')";
                
                //java syntax to execute the sql query
                PreparedStatement pst = conn.prepareStatement(q, Statement.RETURN_GENERATED_KEYS);
                pst.execute();
                if(RoomNo.equals("0") ){
                
                    JOptionPane.showMessageDialog(null, "Sorry, there is no available room for that particular date,"
                            + " \nPlease try the other packages if available...");
                    return;
                    
                }
                
                AddNo_of_reservation(RoomNo);
                
                //pops up a message dialog if the reservation is booked
                JOptionPane.showMessageDialog(null, "Successfully Booked!\n"
                        + "\n Your Room# is: " + RoomNo + "\n");
                ResultSet rs = pst.getGeneratedKeys();
                //this prints the receipt of the booking
                if(rs.next()){

                int resID = rs.getInt(1);
                PrintReciept(reservee, checkindate, RoomNo, receipt(checkindate, nightstay ,reservee, RoomNo, guests, checkprice(nightstay, PackageID), resID ));
                
            }}
            catch(SQLException | HeadlessException e)
                    {
                JOptionPane.showMessageDialog(null, e);
                    }
           
    }
    
    //this method is part of validation to check if
    //the user is logged in or not
    public boolean LoginCheck(int acc_id){
        try{
            String x = "SELECT * FROM accounts WHERE AccountNo = '"+acc_id+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(x);
            if(rs.next()){
                return false;
            }
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
            }
        
    return true;
    }
    
    //this method returns the package ID by getting the
    //package name after the selection of package
    public int getPackageID(String PackageName){
    int id = 0;
    
        try{
            String q = "SELECT * FROM package WHERE PackageName = '"+PackageName+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
            
                id = rs.getInt("Package_ID");
                
            }
            return id;
        
        }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        
        
    return id;
    }
    
    //this method returns all the informations from the
    // selected package ID 
    public Object[] getPackageInfo(int id){
    Object[] packages = new Object[4];
    
        try{
            String q = "SELECT * FROM package WHERE Package_ID = '"+id+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
                
                packages[0] = rs.getInt("Package_ID");
                packages[1] = rs.getString("PackageName");
                packages[2] = rs.getInt("Max_Guests");
                packages[3] = rs.getFloat("Rate");
                
            }
            return packages;
        
        }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
   
    return packages;

    }
    
    //this method returns the suitable packages available for the user
    //depending on how many guests the user entered
    //which then passes to the input dialog from reservation page
    public String[] selectPackageName(int guests) {
    String[] packages = null;
        if(PackageCounter(guests) == 0){
            JOptionPane.showMessageDialog(null, "Sorry, there are no available room for you right now.\n"
                         + "Please check again after few days");
            return packages;
        }
        else{
            packages = new String[PackageCounter(guests)];
        }
            try{
                String q = "SELECT DISTINCT(p.PackageName) "
                        + "FROM package p LEFT JOIN rooms r "
                        + "ON p.Package_ID = r.Package_ID "
                        + "WHERE Max_Guests >= '"+guests+"' "
                        + "AND r.No_of_reservations < '5'";
                
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(q);
                
                while(rs.next()){
                                   
                    packages[rs.getRow() - 1] = rs.getString("PackageName");
                    
                }
                
                rs.close();
                return packages;
                
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        
    return packages;
    }
    
    //this method returns the number of suitable packages for the user
    //depending on how many guests the user entered
    public int PackageCounter(int guests){
        int count = 0;
            try{
                String q = "SELECT COUNT(DISTINCT(p.PackageName)) as 'counts' "
                        + "FROM package p LEFT JOIN rooms r "
                        + "ON p.Package_ID = r.Package_ID "
                        + "WHERE Max_Guests >= '"+guests+"' "
                        + "AND r.No_of_reservations < '5'";
                
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(q);
                
                if(rs.next()){

                    count = rs.getInt("counts");
                    
                }
                
                rs.close();
                return count;
                
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }

    return count;
    }
    
    //this method displays the number of 
    //all the available rooms per package
    public void DisplayAvailableRooms(int guests){
    
    String Contents = "";
        
        for (int i = 0; i < PackageCounter(guests); i++){
        
            Contents += selectPackageName(guests)[i] + " - " + getAvailableRooms(Integer.parseInt(getPackageInfo(getPackageID(selectPackageName(guests)[i]))[0].toString()))
                    +" Available Rooms \n\n";
        
        }
        
        JOptionPane.showMessageDialog(null, "Available Rooms:\n\n" + Contents);
        
    }
    
    //this method returns the number of available rooms
    // on certain package
    private int getAvailableRooms(int PId){
    int rooms =0;
    
        try{
        
            String q = "SELECT COUNT(*) as room FROM rooms WHERE Package_ID = '"+PId+"' AND No_of_reservations < '5'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
        
            if(rs.next()){
            
                rooms = rs.getInt("room");
            
            }
            return rooms;
        }
        
        
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
         }
        
    return rooms;
    
    }
    
    //this method checks the price by getting the number of
    //night stay and getting the package ID, night stay is
    //multiplied to the rate of whatever the package ID's rate
    public int checkprice(int nightstay, int packageID){
        int price;
        
            try{
                String q = "SELECT * FROM package WHERE Package_ID = '"+packageID+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(q);
                
                if(rs.next()){
                    price = rs.getInt("rate") * nightstay;
                    return price;
                }
                
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        
    
    return 0;
    }
    
    //this method is responsible for assigning the available room
    //number on while booking, also secures that there will be
    // no conflict on reservation dates
    // EX. conflict of having the same reservation date on the same room
    public String getRoom(int PackageID, String check_in, int nightstay){
    String roomNo = "0";
        
        try{
            
            String q = "SELECT r.RoomNo FROM rooms r LEFT JOIN reservations rs "
                    + "ON r.RoomNo = rs.RoomNo "
                    + "WHERE r.Package_ID = '"+PackageID+"' "
                    + "AND r.No_of_reservations < '5' "
                    + "AND (NOT(rs.check_in BETWEEN '"+check_in+"' AND DATE_ADD('"+check_in+"', INTERVAL "+nightstay+" day)) "
                    + "OR NOT(rs.check_out BETWEEN '"+check_in+"' AND DATE_ADD('"+check_in+"', INTERVAL "+nightstay+" day)) "
                    + "OR NOT('"+check_in+"' BETWEEN rs.check_in AND rs.check_out)"
                    + "OR rs.check_in IS NULL) "
                    + "ORDER BY rs.check_in DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
                
            if(rs.next()){
            
                roomNo = rs.getString("RoomNo");
                
            }
            return roomNo;
        
        }
        catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
        }
        
    return roomNo;
    }
    
    //this method updates the room's availability to
    //not available or '0'/false
    private void AddNo_of_reservation(String roomNo){
    
        try{
            
            String q = "UPDATE `rooms` SET `No_of_reservations` = `No_of_reservations` + '1' WHERE RoomNo = '"+roomNo+"'";
            PreparedStatement pst = conn.prepareStatement(q);
            pst.execute();
            
        }
        
        catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    //this method prints and downloads the reciept of the booking
    public void PrintReciept(String reservee, String check_in,String RoomNo, String reciept) throws IOException{
        
        FileWriter fl;
        fl = new FileWriter ("receipt\\"+ reservee + "-" + check_in + "-" + RoomNo +"-RESERVATION.doc");
        fl.write(reciept);
        fl.close();
        
        JOptionPane.showMessageDialog(null, "Receipt Successfully downloaded!");
    
    }
    public String receipt(String checkin, int checkout, String Reservee, String RoomNo, int Guests, int Price, int reserveno){
    String info;
    
    info = "Thank you for RESERVING!\n\nGuaranteed a good quality ROOMS!"
            + "\n\nThis is your reciept, you can show this to the counter when checking in"
            + "\n\n"
            + "-------------------------------------------------------------------------\n"
            + "-------------------------------------------------------------------------\n"
            + "\n\n"
            + "Date of Check in: " + checkin +
                "\n\n\nNumber of days: " + checkout +
                "\n\n\nReservee Name: " + Reservee +
                "\n\n\nRoom Number: " + RoomNo+
                "\n\n\nNumber of Guests: " + Guests +
                "\n\n\nAmount Paid: " +Price+ "PHP"
            + "\n\n"
            + "\nUnique Code: AZRE-" + checkin + "-" + checkout + "-" + RoomNo + "-" + Reservee + "-" + Guests + "-" + reserveno
            + "\n-------------------------------------------------------------------------"
            + "\n-------------------------------------------------------------------------"
            + "\n\nAll rights reserved @2021";
    return info;
    }
}
