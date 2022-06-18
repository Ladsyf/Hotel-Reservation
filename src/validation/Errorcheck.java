
package validation;

import javax.swing.JOptionPane;
import queries.ClientQuery;
import queries.LoginRegisterQuery;

//this class contains all the non-SQL methods that validates
// all forms inside the program
public class Errorcheck {
    
    //instantiate LoginRegisterQuery to call a method for validation
    //of form
    LoginRegisterQuery lrq = new LoginRegisterQuery();
    
    //this array will be the combobox value on reservation page,
    //this is here to validate the appropriate date that will be
    //on checkdate()method
    public String monthstr[] = {"January","February","March","April","May","June","July",
                 "August","September","October","November","December"};
    
    
    //this method validates the entered date if it is appropriate
    //ex. February 31, this method will return false because
    //February 31 does not exists
    public boolean Errorcheck(int dd, String mm, int yy){
        
        //initialize the month
        int[] month = {0,0};
        
        //sets the months without 31th day
        int monthswithout31[] = {2,4,6,9,11}; 
        
        //gets the position/index from the declared array above
        for(int i=0; i<monthstr.length; i++){
            if(mm.equals(monthstr[i])){
            month[0] = i+1;}
        }
        
        //marks if the month selected is a month with 31 or not
        for(int i = 0; i<5; i++){
            if (month[0] == monthswithout31[i]){
                month[1] = 1;
                break;
            }
        }
        
        //this condition will return true if
        //the day selected is 31 and the month is
        //marked as month with 31th day
        if(dd > 30 && month[1] == 1){
            
                return true;
            }
        
        //this condition refers to febuary and leap year
        if(dd > 28 && month[0] == 2){
            if(dd == 29 && (yy%4==0 || yy%400==0 || yy%100==0)){
                    return false;
                }
            else
                    return true;
            }
        
    return false;
    }
    
    //this method validates the register form from loginregister
    //first validation - if the email or username already exists on the database - return false
    //second validation - if there is an empty field - return false
    //third validation - if username or password is more the 6 characters - return false
    //fourth validation - if entered password in not equal on re-enter password - return false
    //fifth validation - if the user's age is less than 18 - it will return false
    //otherwise, this method will return true
    public boolean Errorcheck(String email, String user, String pw, String pw2, int age){
        
        if(!lrq.registerValidation(email, user)){
            return false;
        }
        
        if(email.isEmpty() || user.isEmpty() || pw.isEmpty()){
           JOptionPane.showMessageDialog(null, "Please don't leave a field empty");
           return false;
       }
        if(user.length() > 6 || pw.length() > 6){
       
           JOptionPane.showMessageDialog(null, "Sorry, you've reached the maximum characters on username/password");
           return false;
           
       }
        if(!pw.equals(pw2)){
           JOptionPane.showMessageDialog(null, "Password does not match!");
           return false;
       }
        if (age < 18){
           JOptionPane.showMessageDialog(null, "Your age does not match out qualifications");
            return false;
       }
       
        return true;
    }
    
    //this method validates the log in form, if one of the
    // field is empty it will return false
    public boolean Errorcheck(String user, String pw){
    
        if(user.isEmpty() || pw.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out the form completely!");
            return false;
        }
        
    return true;
    }
    
    //this method validates the reservation part.
    //it validates if the user is not logged in, the user cannot add reservations.
    //if the field reservee is blank, it will require the user to fill in the reservee name.
    //if the date is not appropriate, it will return false.
    public boolean Errorcheck(String reservee, int dd, String mm, int yy,int id){
        ClientQuery pq = new ClientQuery();
        
        if(pq.LoginCheck(id)){
            JOptionPane.showMessageDialog(null, "Please Log-in first!\n"
                    + "If you do not have an account, you may Register");
            return false;
        }
        else if(reservee.equals("")){
            JOptionPane.showMessageDialog(null, "Please do not leave a field blank");
            return false;
        }
        else if(Errorcheck(dd, mm, yy)){
            JOptionPane.showMessageDialog(null, "Please select an appropriate date to check-in");
            return false;
        }

    return true;
    }
    
    
}
