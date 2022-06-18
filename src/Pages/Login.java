
package Pages;

import hotel.reservation.HotelReservation;
import java.awt.Color;
import validation.Errorcheck;
import javax.swing.JFrame;
import javax.swing.UIManager;
import queries.LoginRegisterQuery;

//this page pops up when the login/register button is clicked
//this class allows the users to log in or register an account
public class Login extends javax.swing.JFrame {
    
    //instantiation of needed classes
    public LoginRegisterQuery lq = new LoginRegisterQuery();
    Errorcheck er = new Errorcheck();
    
    //creates a variable that will count
    //log in attemps
    int attempt = 0;
    
    //declares a variable id to 
    //store the account id of users/admin that
    //will log in
    int id=0;

    public Login() {
         
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); 
        setTitle("Sign-in");
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        AzureLBL = new javax.swing.JLabel();
        contactLBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        loginPNL = new javax.swing.JPanel();
        signinBTN = new javax.swing.JButton();
        password1LBL = new javax.swing.JLabel();
        passwordpw1TXT = new javax.swing.JPasswordField();
        username1LBL = new javax.swing.JLabel();
        username1TXT = new javax.swing.JTextField();
        skipLoginBTN = new javax.swing.JButton();
        showPWCHCKBX = new javax.swing.JCheckBox();
        RegisterBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(723, 490));
        setMinimumSize(new java.awt.Dimension(723, 490));
        setPreferredSize(new java.awt.Dimension(723, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        AzureLBL.setFont(new java.awt.Font("Freestyle Script", 1, 40)); // NOI18N
        AzureLBL.setForeground(new java.awt.Color(255, 255, 255));
        AzureLBL.setText("Azure Urban Residences");

        contactLBL.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        contactLBL.setForeground(new java.awt.Color(255, 255, 255));
        contactLBL.setText("<html>Azure Urban Residences,<br> KM 16 W Service Rd, Parañaque,<br>1700 Metro Manila<br>09369564256</html>");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AzureLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AzureLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contactLBL)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 60));

        loginPNL.setOpaque(false);
        loginPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinBTN.setBackground(new java.awt.Color(0, 0, 102));
        signinBTN.setForeground(new java.awt.Color(255, 255, 255));
        signinBTN.setText("Sign In");
        signinBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinBTNActionPerformed(evt);
            }
        });
        loginPNL.add(signinBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 295, 45));

        password1LBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password1LBL.setText("Password:");
        loginPNL.add(password1LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        loginPNL.add(passwordpw1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 137, 30));

        username1LBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username1LBL.setText("Username:");
        loginPNL.add(username1LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        loginPNL.add(username1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 137, 31));

        skipLoginBTN.setBackground(new java.awt.Color(0, 51, 204));
        skipLoginBTN.setForeground(new java.awt.Color(255, 255, 255));
        skipLoginBTN.setText("Skip Login >>>");
        skipLoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipLoginBTNActionPerformed(evt);
            }
        });
        loginPNL.add(skipLoginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 295, -1));

        showPWCHCKBX.setText("Show Password");
        loginPNL.add(showPWCHCKBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        RegisterBTN.setBackground(new java.awt.Color(0, 51, 204));
        RegisterBTN.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBTN.setText("Not yet registered? Register Now!");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });
        loginPNL.add(RegisterBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 295, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoMini.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        loginPNL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, 70));

        getContentPane().add(loginPNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 330, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginRegisterBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 362, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //button from log in panel
    //this action gets the values from the log in form and validates
    //if the values match from the database then logs in
    private void signinBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinBTNActionPerformed
        
        String user = (username1TXT.getText()).toLowerCase();
        String pass = (String.valueOf(passwordpw1TXT.getPassword())).toLowerCase();
        
        if(er.Errorcheck(user,pass)){
            
            id = lq.login(user, pass);
            
        }
        if(id != 0 ){
            logged(id);
        }

    }//GEN-LAST:event_signinBTNActionPerformed

    //button from log in panel
    //this action skips the log in phase by disposing
    // this window and calling the Reservation page
    private void skipLoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipLoginBTNActionPerformed
        
        this.dispose();
        new HotelReservation().setVisible(true);
        
    }//GEN-LAST:event_skipLoginBTNActionPerformed

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
        Register rs = new Register();
        rs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterBTNActionPerformed

    //this method determines if the account is an admin
    //or user by getting the account id, if the account
    //is an admin, it calls the adminpage and if it is
    //a user, it calls the regular reservation page
    public void logged(int id){
        
        this.dispose();
        if(lq.getType(id).equals("admin")){
            Adminpage ap = new Adminpage(id);
            ap.setVisible(true);

        }
        else{
            
            HotelReservation hr = new HotelReservation(id);
            hr.setVisible(true);
            
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AzureLBL;
    private javax.swing.JButton RegisterBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginPNL;
    private javax.swing.JLabel password1LBL;
    private javax.swing.JPasswordField passwordpw1TXT;
    private javax.swing.JCheckBox showPWCHCKBX;
    private javax.swing.JButton signinBTN;
    private javax.swing.JButton skipLoginBTN;
    private javax.swing.JLabel username1LBL;
    private javax.swing.JTextField username1TXT;
    // End of variables declaration//GEN-END:variables

}
