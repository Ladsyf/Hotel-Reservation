/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import java.awt.Color;
import validation.Errorcheck;
import javax.swing.JFrame;
import javax.swing.UIManager;
import queries.LoginRegisterQuery;

public class Register extends javax.swing.JFrame {

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

    public Register() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); 
        setTitle("Sign-up");
        
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        topbluePNL = new javax.swing.JPanel();
        AzureLBL = new javax.swing.JLabel();
        contactLBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        registerPNL = new javax.swing.JPanel();
        signupBTN = new javax.swing.JButton();
        ageSPNNR = new javax.swing.JSpinner();
        ageLBL = new javax.swing.JLabel();
        genderLBL = new javax.swing.JLabel();
        maleRDBTN = new javax.swing.JRadioButton();
        femaleRDBTN = new javax.swing.JRadioButton();
        rpasswordLBL = new javax.swing.JLabel();
        passwordpw2TXT = new javax.swing.JPasswordField();
        passwordLBL = new javax.swing.JLabel();
        passwordpWTXT = new javax.swing.JPasswordField();
        usernameLBL = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        emailTXT = new javax.swing.JTextField();
        emailLBL = new javax.swing.JLabel();
        ShowPWsCHCKBX = new javax.swing.JCheckBox();
        LoginBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(723, 490));
        setMinimumSize(new java.awt.Dimension(723, 490));
        setPreferredSize(new java.awt.Dimension(723, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topbluePNL.setBackground(new java.awt.Color(0, 51, 153));

        AzureLBL.setFont(new java.awt.Font("Freestyle Script", 1, 40)); // NOI18N
        AzureLBL.setForeground(new java.awt.Color(255, 255, 255));
        AzureLBL.setText("Azure Urban Residences");

        contactLBL.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        contactLBL.setForeground(new java.awt.Color(255, 255, 255));
        contactLBL.setText("<html>Azure Urban Residences,<br> KM 16 W Service Rd, Para??aque,<br>1700 Metro Manila<br>09369564256</html>");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout topbluePNLLayout = new javax.swing.GroupLayout(topbluePNL);
        topbluePNL.setLayout(topbluePNLLayout);
        topbluePNLLayout.setHorizontalGroup(
            topbluePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbluePNLLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(AzureLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        topbluePNLLayout.setVerticalGroup(
            topbluePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AzureLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contactLBL)
            .addGroup(topbluePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topbluePNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        registerPNL.setOpaque(false);
        registerPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupBTN.setBackground(new java.awt.Color(0, 0, 102));
        signupBTN.setForeground(new java.awt.Color(255, 255, 255));
        signupBTN.setLabel("Sign Up");
        signupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBTNActionPerformed(evt);
            }
        });
        registerPNL.add(signupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 295, 34));

        ageSPNNR.setName(""); // NOI18N
        registerPNL.add(ageSPNNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 47, 28));

        ageLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ageLBL.setText("Age:");
        registerPNL.add(ageLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        genderLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderLBL.setText("Gender:");
        registerPNL.add(genderLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        buttonGroup1.add(maleRDBTN);
        maleRDBTN.setSelected(true);
        maleRDBTN.setText("Male");
        maleRDBTN.setActionCommand("Male");
        maleRDBTN.setName("maleRDBTN"); // NOI18N
        registerPNL.add(maleRDBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        buttonGroup1.add(femaleRDBTN);
        femaleRDBTN.setText("Female");
        femaleRDBTN.setActionCommand("Female");
        femaleRDBTN.setName("femaleRDBTN"); // NOI18N
        registerPNL.add(femaleRDBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        rpasswordLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rpasswordLBL.setText("Re-Enter Password:");
        registerPNL.add(rpasswordLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));
        registerPNL.add(passwordpw2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 137, 30));

        passwordLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLBL.setText("Password:");
        registerPNL.add(passwordLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        registerPNL.add(passwordpWTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 137, 30));

        usernameLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLBL.setText("Username:");
        registerPNL.add(usernameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        registerPNL.add(usernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 137, 31));
        registerPNL.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 137, 31));

        emailLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLBL.setText("Email:");
        registerPNL.add(emailLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        ShowPWsCHCKBX.setText("Show Passwords");
        registerPNL.add(ShowPWsCHCKBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        LoginBTN.setBackground(new java.awt.Color(0, 51, 204));
        LoginBTN.setForeground(new java.awt.Color(255, 255, 255));
        LoginBTN.setText("Already have an account? Login!");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });
        registerPNL.add(LoginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 295, -1));

        getContentPane().add(registerPNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 350, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginRegisterBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 362, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBTNActionPerformed
        String email = (emailTXT.getText()).toLowerCase();
        String user = (usernameTXT.getText()).toLowerCase();
        String pass = (String.valueOf(passwordpWTXT.getPassword())).toLowerCase();
        String pass2 = (String.valueOf(passwordpw2TXT.getPassword())).toLowerCase();
        int age = Integer.parseInt(ageSPNNR.getValue().toString());
        String gen = buttonGroup1.getSelection().getActionCommand();

        if(er.Errorcheck(email, user, pass, pass2, age)){

            lq.register(email, user, pass, age, gen, "user");
            Login log = new Login();
            log.logged(lq.login(user, pass));
            this.dispose();

        }

    }//GEN-LAST:event_signupBTNActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AzureLBL;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JCheckBox ShowPWsCHCKBX;
    private javax.swing.JLabel ageLBL;
    private javax.swing.JSpinner ageSPNNR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactLBL;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JRadioButton femaleRDBTN;
    private javax.swing.JLabel genderLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton maleRDBTN;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordpWTXT;
    private javax.swing.JPasswordField passwordpw2TXT;
    private javax.swing.JPanel registerPNL;
    private javax.swing.JLabel rpasswordLBL;
    private javax.swing.JButton signupBTN;
    private javax.swing.JPanel topbluePNL;
    private javax.swing.JLabel usernameLBL;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
