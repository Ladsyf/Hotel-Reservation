
package hotel.reservation;

import validation.Errorcheck;
import Pages.Login;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.UIManager;
import queries.ClientQuery;

//this class is the main class of this project
//this page pops up when the system starts
public class HotelReservation extends javax.swing.JFrame {
    
    //instantiation of needed classes
    Errorcheck er = new Errorcheck();
    Login lg = new Login();
    ClientQuery cq = new ClientQuery();
    UIManager UI=new UIManager();
    //declaration of variable where account id
    //will be stored
    int id = 0;

    //we used method overloading to determine
    //if the account is logged in or not
    public HotelReservation() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); 

        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        
    }
    public HotelReservation(int id) {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        
        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        UI.put("Button.disabledText",Color.white);
        
        //passes the account ID from the parameter
        this.id = id;
        
        logoutBTN.setVisible(true);
        loginBTN.setEnabled(false);
        loginBTN.setText(lg.lq.getUsername(id));
        loginBTN.setContentAreaFilled(false);
        

        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bluetopPNL = new javax.swing.JPanel();
        loginBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        AzureLBL = new javax.swing.JLabel();
        contactLBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        guestsLBL = new javax.swing.JLabel();
        bookBTN = new javax.swing.JButton();
        checkPriceBTN = new javax.swing.JButton();
        checkRoomsBTN = new javax.swing.JButton();
        reserveeTXT = new javax.swing.JTextField();
        dayCMBX = new javax.swing.JComboBox();
        monthCMBX = new javax.swing.JComboBox();
        yearCMBX = new javax.swing.JComboBox();
        nightstayCMBX = new javax.swing.JComboBox();
        guestsCMBX = new javax.swing.JComboBox();
        reserveeLBL = new javax.swing.JLabel();
        checkInLBL = new javax.swing.JLabel();
        nightStayLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setMinimumSize(new java.awt.Dimension(780, 525));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bluetopPNL.setBackground(new java.awt.Color(0, 51, 153));
        bluetopPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBTN.setBackground(new java.awt.Color(0, 102, 255));
        loginBTN.setForeground(new java.awt.Color(255, 255, 255));
        loginBTN.setText("Login/Register");
        loginBTN.setToolTipText("");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });
        bluetopPNL.add(loginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 37));

        exitBTN.setBackground(new java.awt.Color(255, 51, 51));
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("EXIT");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        bluetopPNL.add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 37));

        logoutBTN.setBackground(new java.awt.Color(102, 204, 255));
        logoutBTN.setForeground(new java.awt.Color(255, 255, 255));
        logoutBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lout.png"))); // NOI18N
        logoutBTN.setText("Logout");
        logoutBTN.setVisible(false);
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });
        bluetopPNL.add(logoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 90, 37));
        logoutBTN.getAccessibleContext().setAccessibleDescription("");

        AzureLBL.setFont(new java.awt.Font("Freestyle Script", 1, 40)); // NOI18N
        AzureLBL.setForeground(new java.awt.Color(255, 255, 255));
        AzureLBL.setText("Azure Urban Residences");
        bluetopPNL.add(AzureLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        contactLBL.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        contactLBL.setForeground(new java.awt.Color(255, 255, 255));
        contactLBL.setText("<html>Azure Urban Residences,<br> KM 16 W Service Rd, Parañaque,<br>1700 Metro Manila<br>09369564256</html>");
        bluetopPNL.add(contactLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 60));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bluetopPNL.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 40));

        getContentPane().add(bluetopPNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        guestsLBL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guestsLBL.setText("Total Guests:");

        bookBTN.setBackground(new java.awt.Color(0, 0, 102));
        bookBTN.setForeground(new java.awt.Color(255, 255, 255));
        bookBTN.setText("Book Now!");
        bookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBTNActionPerformed(evt);
            }
        });

        checkPriceBTN.setBackground(new java.awt.Color(0, 51, 204));
        checkPriceBTN.setForeground(new java.awt.Color(255, 255, 255));
        checkPriceBTN.setText("Check Price");
        checkPriceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPriceBTNActionPerformed(evt);
            }
        });

        checkRoomsBTN.setBackground(new java.awt.Color(0, 51, 204));
        checkRoomsBTN.setForeground(new java.awt.Color(255, 255, 255));
        checkRoomsBTN.setText("Check Available Rooms");
        checkRoomsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRoomsBTNActionPerformed(evt);
            }
        });

        dayCMBX.setBackground(new java.awt.Color(204, 204, 204));
        dayCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayCMBX.setFocusable(false);
        dayCMBX.setLightWeightPopupEnabled(false);
        dayCMBX.setMaximumSize(new java.awt.Dimension(56, 20));
        dayCMBX.setRequestFocusEnabled(false);

        monthCMBX.setBackground(new java.awt.Color(204, 204, 204));
        monthCMBX.setModel(new DefaultComboBoxModel(er.monthstr));
        monthCMBX.setFocusable(false);
        monthCMBX.setLightWeightPopupEnabled(false);
        monthCMBX.setMaximumSize(new java.awt.Dimension(56, 20));
        monthCMBX.setRequestFocusEnabled(false);

        yearCMBX.setBackground(new java.awt.Color(204, 204, 204));
        yearCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2021", "2022", "2023", "2024", "2025" }));
        yearCMBX.setFocusable(false);
        yearCMBX.setLightWeightPopupEnabled(false);
        yearCMBX.setMaximumSize(new java.awt.Dimension(56, 20));
        yearCMBX.setRequestFocusEnabled(false);

        nightstayCMBX.setBackground(new java.awt.Color(204, 204, 204));
        nightstayCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        nightstayCMBX.setFocusable(false);
        nightstayCMBX.setLightWeightPopupEnabled(false);
        nightstayCMBX.setMaximumSize(new java.awt.Dimension(56, 20));
        nightstayCMBX.setRequestFocusEnabled(false);

        guestsCMBX.setBackground(new java.awt.Color(204, 204, 204));
        guestsCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        guestsCMBX.setFocusable(false);
        guestsCMBX.setLightWeightPopupEnabled(false);
        guestsCMBX.setMaximumSize(new java.awt.Dimension(56, 20));
        guestsCMBX.setRequestFocusEnabled(false);

        reserveeLBL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reserveeLBL.setText("Reservee Name:");

        checkInLBL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkInLBL.setText("Check-in Date:");

        nightStayLBL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nightStayLBL.setText("Night-Stay:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reserveeLBL)
                    .addComponent(checkInLBL)
                    .addComponent(nightStayLBL)
                    .addComponent(guestsLBL))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestsCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nightstayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reserveeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bookBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkPriceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(checkRoomsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserveeLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightstayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nightStayLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestsCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guestsLBL))
                .addGap(18, 18, 18)
                .addComponent(checkRoomsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPriceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 380, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ClientViewBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //this action gets the values from the form and validates the informations.
    //pops up an input dialog to choose a package and pops up a confirm dialog that will
    //show the price and adds the reservation to the database
    private void bookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBTNActionPerformed
    
        String reservee = reserveeTXT.getText();
        int dd = Integer.parseInt(dayCMBX.getSelectedItem().toString());
        String mm = (String) monthCMBX.getSelectedItem();
        int yy = Integer.parseInt(yearCMBX.getSelectedItem().toString());
        String checkindate = Integer.toString(yy) +"-" + (monthCMBX.getSelectedIndex()+1) 
                             +"-"+  Integer.toString(dd);
        int nightstay = Integer.parseInt(nightstayCMBX.getSelectedItem().toString());
        int guests = Integer.parseInt(guestsCMBX.getSelectedItem().toString());

        if (er.Errorcheck(reservee, dd, mm, yy, id)){
            
            String SelectedPackage = null;
            
            if(cq.selectPackageName(guests) != null){
                
                SelectedPackage = (String) JOptionPane.showInputDialog(null,
                "Available Packages:",
                "Packages",
                JOptionPane.QUESTION_MESSAGE,
                null,cq.selectPackageName(guests) ,cq.selectPackageName(guests)[0]);
               
                }
            
            if(SelectedPackage != null){
                 
                int packageID = cq.getPackageID(SelectedPackage);
                String Room = cq.getRoom(packageID, checkindate, nightstay);
            
                int confirm = JOptionPane.showConfirmDialog(null,
                            "\nPackage: " + SelectedPackage + "\n\n"
                            + "This Package is good for " + cq.getPackageInfo(packageID)[2] + " person/s\n\n"
                            + "Amount Payable: " + (Float.parseFloat(cq.getPackageInfo(packageID)[3].toString()) * nightstay) 
                            + "PHP\n"
                            + "\nDo you want to continue?\n\n",
                    "More Details",
                    JOptionPane.YES_NO_OPTION ,
                    JOptionPane.INFORMATION_MESSAGE);
                    
                if(confirm == YES_OPTION){
                    try {
                        cq.book(reservee, checkindate, nightstay, guests, id, packageID, Room);
                    } catch (IOException ex) {
                        Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
            
    }//GEN-LAST:event_bookBTNActionPerformed

    //if not logged in, this action calls the login/register page
    // and closes the current window
    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
       
        new Login().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_loginBTNActionPerformed

    //this action exits the system after a confirmation dialog
    // to confirm if the user wants to exit the program
    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
                "Thank you for availing", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitBTNActionPerformed

    //this action show the price by gettings the Night stay and
    //number of guests and selected package
    private void checkPriceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPriceBTNActionPerformed
        int nightstay = Integer.parseInt(nightstayCMBX.getSelectedItem().toString());
        int guests = Integer.parseInt(guestsCMBX.getSelectedItem().toString());
        String SelectedPackage = null;
        
            if(cq.selectPackageName(guests) != null){
                
                SelectedPackage = (String) JOptionPane.showInputDialog(null,
                "Available Packages:",
                "Packages",
                JOptionPane.QUESTION_MESSAGE,
                null,cq.selectPackageName(guests) ,cq.selectPackageName(guests)[0]);
                
            }
             if(SelectedPackage != null){
                int packageID = cq.getPackageID(SelectedPackage);
                JOptionPane.showMessageDialog(null,
                    "\nPackage: " + SelectedPackage + "\n\n"
                            + "This Package is good for " + cq.getPackageInfo(packageID)[2] + " person/s\n\n"
                            + "Amount Payable: " + (Float.parseFloat(cq.getPackageInfo(packageID)[3].toString()) * nightstay) + "PHP\n\n"
                            ,
                    "More Details",
                    JOptionPane.INFORMATION_MESSAGE, null);
             
             }
        
    }//GEN-LAST:event_checkPriceBTNActionPerformed

    //this action logs out the user after a confirmation dialog
    // by setting the ID to 0, disposing this window and
    // calling the login/register page
    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?",
                "Thank you for signing in!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res == JOptionPane.YES_OPTION){
            this.dispose();
            id = 0;
            lg.setVisible(true);
            
        }
    }//GEN-LAST:event_logoutBTNActionPerformed

    //this action calls a method from ClientQuery class that display
    //available rooms per package
    private void checkRoomsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRoomsBTNActionPerformed
        
        cq.DisplayAvailableRooms(1);
        
    }//GEN-LAST:event_checkRoomsBTNActionPerformed

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new HotelReservation().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AzureLBL;
    private javax.swing.JPanel bluetopPNL;
    private javax.swing.JButton bookBTN;
    private javax.swing.JLabel checkInLBL;
    private javax.swing.JButton checkPriceBTN;
    private javax.swing.JButton checkRoomsBTN;
    private javax.swing.JLabel contactLBL;
    private javax.swing.JComboBox dayCMBX;
    private javax.swing.JButton exitBTN;
    private javax.swing.JComboBox guestsCMBX;
    private javax.swing.JLabel guestsLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginBTN;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JComboBox monthCMBX;
    private javax.swing.JLabel nightStayLBL;
    private javax.swing.JComboBox nightstayCMBX;
    private javax.swing.JLabel reserveeLBL;
    private javax.swing.JTextField reserveeTXT;
    private javax.swing.JComboBox yearCMBX;
    // End of variables declaration//GEN-END:variables



}

