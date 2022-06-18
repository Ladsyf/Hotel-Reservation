
package queries;

import java.sql.Connection;
import java.sql.DriverManager;

//this class contains the connection of this project
// to the database
public class DBconn {
    
    public static Connection connect(){
        //declaration of connection
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            //sets the value of the connection to the location and credentials of the database
            //that will be used
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ReservationDB?","root","");  
            }
        catch (Exception e){
            System.out.println("inter.DBCONN.connect()");
            }
        return conn;
    }
    
}
