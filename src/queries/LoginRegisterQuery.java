
package queries;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

//this class contains all the SQL queries that is
//related to accounts login or register
public class LoginRegisterQuery {
    
    //declares a counter for login attempts
    int attempt = 0;
    
    public static int id=0; 
    
    //initialize the connection to the database
    Connection conn = DBconn.connect();
    
    //this method gets the login credentials and counts the number
    // of attempts up to 3 times, validates if there's a matching
    //records on the database and returns the
    // account ID that will be valitated on loginregister class
    public int login(String user, String pw){

        String hashpw = String.valueOf(pw.hashCode());
        try{
            
            //SQL query that gets the needed values from the database
            String q = "SELECT AccountNo FROM accounts WHERE username = '"+user+"' AND password = '"+hashpw+"'";
            
            //java syntax to execute the sql query
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            //assigns the account number value to the declared ID on this class
            if(rs.next()){
                
                id = rs.getInt("AccountNo");
                
            return id;
            
                }   
            //this else statement will pop up if the credentials entered does not have
            // a result on the database, adds an attempt count
            else {

                JOptionPane.showMessageDialog(null, "Sorry, the credentials entered does not match out records.");   
                
                attempt += 1;
                //if the attempt acount is more than 2, the system will exit.
                if (attempt > 2){
            
                    JOptionPane.showMessageDialog(null, "Sorry, you've reached the maximum number of attempts (3)."
                            + "\n The system will now exit.");
                    System.exit(0);
                
                    }
                
                return 0;

            }
        
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return id;
    }
    
    //this method adds a row to the accounts table from the database
    public void register(String email, String user, String pw, int age, String gender, String type){
        
        //encrypts the password for security
        String hashpw = String.valueOf(pw.hashCode());
        try {
            //SQL query that will insert the data from the parameters
            String q = "INSERT INTO accounts VALUES(null, '"+email+"','"+user+"','"+hashpw+"','"+age+"','"+gender+"','"+type+"')";

            PreparedStatement pst = conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered!");
        
        }
        catch(SQLException | HeadlessException e){
            
            JOptionPane.showMessageDialog(null, e);
        
        }
          
    }
    
    //this method returns the value of the username by
    //getting the account ID
    public String getUsername(int id){
    String user="";
            try{
                String q = "SELECT username FROM accounts WHERE AccountNo = '"+id+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(q);
                
                if(rs.next()){
                    user = rs.getString("username");
                }
        
        }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        
    return user;
    }
    
    //this method returns the account type by 
    //getting the account ID
    public String getType(int id){
        
        String type = "";
            try{
                String q = "SELECT type FROM accounts WHERE AccountNo = '"+id+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(q);
                
                if(rs.next()){
                    type = rs.getString("type");
                }
                
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        
        
    return type;
    }
    //this method returns false if a register attempt already has the same
    // email and username on the database records
    public boolean registerValidation(String email, String user){
       try{
        String check = "SELECT email, username FROM accounts WHERE email = '"+email+"' or username = '"+user+"'";
        Statement st = conn.createStatement();
        
        ResultSet rs = st.executeQuery(check);

        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Sorry, the email or username you entered already exist on our records");
            return false;
        }
        }
        catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
        }
       return true;
}

}

