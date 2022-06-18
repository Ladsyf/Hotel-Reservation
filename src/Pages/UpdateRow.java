package Pages;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.UIManager;
import queries.AdminQuery;
import validation.Errorcheck;

//this class pops up when the admin clicks the update
//button from adminpage on reservations tab
public class UpdateRow extends javax.swing.JFrame {

    //instantiation of needed classes
    Errorcheck er = new Errorcheck();
    AdminQuery aq = new AdminQuery();
    
    //declaration of variables that the adminpage
    //will pass on this class
    int RId;
    String reservee;
    Adminpage ap;
    
    //passes the reservation ID, Reservee Name, that
    //will be edited/update and passes the AdminPage object
    // for the reference to get back to the adminpage when this class
    //ended
    public UpdateRow(int id ,String name, Adminpage ap) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        
        //passes the value of parameters to
        // the declared variables above
        RId = id;
        reservee = name;
        this.ap = ap;
        
        reserveeTXT.setText(reservee);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReserveeLBL = new javax.swing.JLabel();
        reserveeTXT = new javax.swing.JTextField();
        dayCMBX = new javax.swing.JComboBox();
        monthCMBX = new javax.swing.JComboBox();
        yearCMBX = new javax.swing.JComboBox();
        check_inLBL = new javax.swing.JLabel();
        nightstayCMBX = new javax.swing.JComboBox();
        daysLBL = new javax.swing.JLabel();
        guestsCMBX = new javax.swing.JComboBox();
        guestsLBL = new javax.swing.JLabel();
        UpdateBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(328, 250));
        setMinimumSize(new java.awt.Dimension(328, 250));

        ReserveeLBL.setText("Reservee:");

        dayCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        monthCMBX.setModel(new DefaultComboBoxModel(er.monthstr));
        monthCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        yearCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2021", "2022", "2023", "2024", "2025" }));
        yearCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        check_inLBL.setText("Check-in Date:");

        nightstayCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        nightstayCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        daysLBL.setText("Night-Stay:");

        guestsCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        guestsCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        guestsLBL.setText("Total Guests:");

        UpdateBTN.setText("Update");
        UpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTNActionPerformed(evt);
            }
        });

        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(daysLBL)
                            .addComponent(ReserveeLBL)
                            .addComponent(check_inLBL)
                            .addComponent(guestsLBL))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(reserveeTXT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(dayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guestsCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nightstayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UpdateBTN)
                        .addGap(66, 66, 66)
                        .addComponent(CancelBTN)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReserveeLBL)
                    .addComponent(reserveeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_inLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightstayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestsCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guestsLBL))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBTN)
                    .addComponent(CancelBTN))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //this action calls the updateReservation method from
    //adminQuery to pass the updated informations 
    //from this forms and disposes this window
    private void UpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTNActionPerformed
       
        String UReserve = reserveeTXT.getText();
        String Ucheck_in = yearCMBX.getSelectedItem() + "-"
                            + (monthCMBX.getSelectedIndex() + 1) + "-"
                            + dayCMBX.getSelectedItem();
        int days = Integer.parseInt(nightstayCMBX.getSelectedItem().toString());
        int guests = Integer.parseInt(guestsCMBX.getSelectedItem().toString());
        
        aq.updateReservation(RId, UReserve, Ucheck_in, days, guests);
        dispose();
        ap.getReserveResult();
        
    }//GEN-LAST:event_UpdateBTNActionPerformed
    //this action disposes this window
    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        dispose();
    }//GEN-LAST:event_CancelBTNActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBTN;
    private javax.swing.JLabel ReserveeLBL;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JLabel check_inLBL;
    private javax.swing.JComboBox dayCMBX;
    private javax.swing.JLabel daysLBL;
    private javax.swing.JComboBox guestsCMBX;
    private javax.swing.JLabel guestsLBL;
    private javax.swing.JComboBox monthCMBX;
    private javax.swing.JComboBox nightstayCMBX;
    private javax.swing.JTextField reserveeTXT;
    private javax.swing.JComboBox yearCMBX;
    // End of variables declaration//GEN-END:variables
}
