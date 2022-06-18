package Pages;

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
import validation.Errorcheck;

// This java class pops when adding a row from admin page
public class AddRow extends javax.swing.JFrame {

    Errorcheck er = new Errorcheck();
    ClientQuery cq = new ClientQuery();
    int id = 1;
    Adminpage Admin;
    
    
    // the method passes the id to include on the records 
    //and the admin page object for the reference
    //to get back to the admin page after disposal of
    // this object
    
    public AddRow(int id, Adminpage ap) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        
        this.id = id;
        Admin = ap;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTXT = new javax.swing.JLabel();
        reserveeTXT = new javax.swing.JTextField();
        dateTXT = new javax.swing.JLabel();
        dayCMBX = new javax.swing.JComboBox();
        monthCMBX = new javax.swing.JComboBox();
        yearCMBX = new javax.swing.JComboBox();
        nightstayCMBX = new javax.swing.JComboBox();
        nightStayTXT = new javax.swing.JLabel();
        guestsTXT = new javax.swing.JLabel();
        guestsCMBX = new javax.swing.JComboBox();
        AddRowBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        nameTXT.setText("Reservee Name:");

        dateTXT.setText("Check-in Date:");

        dayCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        monthCMBX.setModel(new DefaultComboBoxModel(er.monthstr));
        monthCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        yearCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2021", "2022", "2023", "2024", "2025" }));
        yearCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        nightstayCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        nightstayCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        nightStayTXT.setText("Night-Stay:");

        guestsTXT.setText("Total Guests:");

        guestsCMBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        guestsCMBX.setMaximumSize(new java.awt.Dimension(56, 20));

        AddRowBTN.setText("Add Now");
        AddRowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRowBTNActionPerformed(evt);
            }
        });

        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTXT)
                            .addComponent(dateTXT)
                            .addComponent(nightStayTXT)
                            .addComponent(guestsTXT))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestsCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nightstayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reserveeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(monthCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yearCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(AddRowBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightstayCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nightStayTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestsCMBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guestsTXT))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(AddRowBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // This button performs the getting of informations from the form
    // and adding the row to the database
    // and refreshing the table from adminpage
    // also disposes this window
    private void AddRowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRowBTNActionPerformed

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
                    + "Amount Payable: " + (Float.parseFloat(cq.getPackageInfo(packageID)[3].toString()) * nightstay) + "PHP\n"
                    + "\nDo you want to continue?\n\n",
                    "More Details",
                    JOptionPane.YES_NO_OPTION ,
                    JOptionPane.INFORMATION_MESSAGE);

                if(confirm == YES_OPTION){
                    
                    try {
                        cq.book(reservee, checkindate, nightstay, guests, id, packageID, Room);
                        dispose();
                        Admin.getReserveResult();
                    } catch (IOException ex) {
                        Logger.getLogger(AddRow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }

    }//GEN-LAST:event_AddRowBTNActionPerformed
    // this action disposes this window 
    //to get back to the admin page
    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBTNActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRowBTN;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel dateTXT;
    private javax.swing.JComboBox dayCMBX;
    private javax.swing.JComboBox guestsCMBX;
    private javax.swing.JLabel guestsTXT;
    private javax.swing.JComboBox monthCMBX;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JLabel nightStayTXT;
    private javax.swing.JComboBox nightstayCMBX;
    private javax.swing.JTextField reserveeTXT;
    private javax.swing.JComboBox yearCMBX;
    // End of variables declaration//GEN-END:variables
}
