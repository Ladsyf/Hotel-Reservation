
package queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


//This class contains all the methods that contains
//all SQL queries that will be used by the admin
//from adminpage
public class AdminQuery {

    //instantiates the needed classes
    public ClientQuery cq = new ClientQuery();
    LoginRegisterQuery lrq = new LoginRegisterQuery();
    
    //calls the connection to database from DBconn class
    Connection conn = DBconn.connect();
    
    //this method returns the informations from reservation 
    //and package table from the database which will be
    //the content of reservation table from adminpage class
    public Object[][] reservationsTableInfo(){

    Object[][] Info = new Object[ReservationCounts()][9];
    //declaration of counter
    int i = 0;
    
        try {
            //SQL query that gets the needed values from the database
            String q = "SELECT r.ReserveID ,r.reservee, p.PackageName, r.RoomNo, r.check_in, "
                    + "r.check_out, night_stay, Guests, (p.Rate * r.night_stay) 'Price' "
                    + "FROM reservations r left join package p " +
                        "ON p.Package_ID = r.Package_ID";

            //java syntax to execute the sql query
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            //loop to assign the values of the results to the 2d array
            while(rs.next()){
                
                Info[i][0] = rs.getInt("ReserveID");
                Info[i][1] = rs.getString("reservee");
                Info[i][2] = rs.getString("PackageName");
                Info[i][3] = rs.getString("RoomNo");
                Info[i][4] = rs.getString("check_in");
                Info[i][5] = rs.getString("check_out");
                Info[i][6] = rs.getInt("night_stay");
                Info[i][7] = rs.getInt("Guests");
                Info[i][8] = rs.getString("Price") + " PHP";
                
                i++;
            }
            //returns the values of the queries
            rs.close();
            return Info;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    //this part returns null if the try-catch is not successful
    return Info;
    }
    
    //this method counts all the rows from reservations table
    // for us to be able to determine the size of 2d array on
    // reservationsTableInfo()
    public int ReservationCounts(){
    int counts = 0;
    
        try {   
            
            String q = "SELECT COUNT(*) as c FROM reservations";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            if(rs.next()){
            
                counts = rs.getInt("c");
                
            }
            rs.close();
            return counts;
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return counts;
    }
    
    //this method is same as reservationsTableInfo(), but returns
    // the values from rooms table from the database which
    // will be the conten of rooms table from admin page class
    public Object[][] roomTableInfo(){
    Object[][] Info = new Object[RoomCounts()][3];
    int i = 0;
    
        try {
            
            String q = "SELECT r.RoomNo, p.PackageName, r.No_of_reservations "
                    + "FROM rooms r RIGHT JOIN package p "
                    + "ON p.Package_ID = r.Package_ID ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
                
                Info[i][0] = rs.getString("RoomNo");
                Info[i][1] = rs.getString("PackageName");
                Info[i][2] = rs.getString("No_of_reservations");
                
                i++;
            }
            rs.close();
            return Info;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return Info;
    }
    
    //same as the method reservationCounts(), but
    // returns the number of rows on rooms table
    public int RoomCounts(){
    int counts = 0;
    
        try {   
            
            String q = "SELECT COUNT(*) as c FROM rooms";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            if(rs.next()){
            
                counts = rs.getInt("c");
                
            }
            rs.close();
            return counts;
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return counts;
    }
    
    //this method is same as reservationsTableInfo(), but returns
    // the values from accounts table from the database which
    // will be the content of accounts table from admin page class
    public Object[][] accountTableInfo(int id){
    Object[][] Info = new Object[AccountCounts(id)][6];
    int i = 0;
    
        try {
            
            String q = "SELECT * FROM accounts WHERE AccountNo != '"+id+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
                
                Info[i][0] = rs.getString("AccountNo");
                Info[i][1] = rs.getString("email");
                Info[i][2] = rs.getString("username");
                Info[i][3] = rs.getString("age");
                Info[i][4] = rs.getString("gender");
                Info[i][5] = rs.getString("type");
                
                i++;
            }
            rs.close();
            return Info;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return Info;
    }
    
    //same as the method reservationCounts(), but
    // returns the number of rows on accounts table
    public int AccountCounts(int id){
    int counts = 0;
    
        try {   
            
            String q = "SELECT COUNT(*) as c FROM accounts WHERE AccountNo != '"+id+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            if(rs.next()){
            
                counts = rs.getInt("c");
                
            }
            rs.close();
            return counts;
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return counts;
    }
    
    //this method updates the selected values from reservations table
    public void updateReservation(int id, String name, String check_in , int days , int guests){
    
        try {
            
            String q = "UPDATE reservations SET reservee = '"+name+"',"
                    + "check_in = '"+check_in+"',"
                    + "check_out = DATE_ADD('"+check_in+"', INTERVAL "+days+" day),"
                    + "night_stay = '"+days+"',"
                    + "Guests = '"+guests+"' "
                    + "WHERE ReserveID = '"+id+"'";
            PreparedStatement pst = conn.prepareStatement(q);
            pst.execute();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    }
    
    //this method deletes a row from reservations table 
    //and making the room available that is reserved
    //to the row that is being deleted
    public void deleteReservation(int RId){
        try {
            String q = "UPDATE rooms SET No_of_reservations = No_of_reservations - '1' "
                    + "WHERE RoomNo = (SELECT RoomNo FROM reservations WHERE ReserveID = '"+RId+"');";
            PreparedStatement pst1 = conn.prepareStatement(q);
            pst1.execute();
            pst1.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String q = "DELETE FROM reservations WHERE reservations.ReserveID = '"+RId+"'";
            PreparedStatement pst2 = conn.prepareStatement(q);
            pst2.execute();
            JOptionPane.showMessageDialog(null, "Successfully deleted!");
            pst2.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //this method updates the account type to admin
    //of the selected row by getting the account ID
    public void Promote(int id){
    
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to promote user " 
                                    + lrq.getUsername(id) + " to ADMIN?"
                                    ,"Please Read Carefully", JOptionPane.YES_NO_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE); 
            if (lrq.getType(id).equals("admin")){
            
                JOptionPane.showMessageDialog(null, "Sorry, the selected row is already an admin");
                
            }
            else if(confirm == JOptionPane.YES_OPTION){

            try {

                String q = "UPDATE accounts SET type = 'admin' "
                        + "WHERE AccountNo = '"+id+"'";
                PreparedStatement pst = conn.prepareStatement(q);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Successfully promoted to admin!");

            } catch (SQLException ex) {
                Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //this method updates the account type to user
    //of the selected row by getting the account ID
    public void Demote(int id){
    
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to demote user " 
                                    + lrq.getUsername(id) + " to USER?"
                                    ,"Please Read Carefully", JOptionPane.YES_NO_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE); 
            if (lrq.getType(id).equals("user")){
            
                JOptionPane.showMessageDialog(null, "Sorry, the selected row is already a user");
                
            }
            else if(confirm == JOptionPane.YES_OPTION){

            try {

                String q = "UPDATE accounts SET type = 'user' "
                        + "WHERE AccountNo = '"+id+"'";
                PreparedStatement pst = conn.prepareStatement(q);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Successfully demoted to user!");

            } catch (SQLException ex) {
                Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String getRoomReservations(String RoomNo){
    String results = "";
        
        try {   
            
            String q = "SELECT * FROM reservations WHERE RoomNo = '"+RoomNo+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
            
                results += "<html>Reserved to: " + rs.getString("reservee")
                            + "<br>From: " + rs.getString("check_in") 
                            + "<br>To: " + rs.getString("check_out")
                            + "<br>Number of Guests: " + rs.getString("guests")
                            + "<br><br><html>";
                
            }
            rs.close();
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return results;
    }
    
}
