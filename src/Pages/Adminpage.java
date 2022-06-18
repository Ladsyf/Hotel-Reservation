 
package Pages;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import queries.AdminQuery;

// this class pops up when an admin account logs in
public class Adminpage extends javax.swing.JFrame {

    //instantiation of needed classes
    Login lg = new Login();
    AdminQuery aq = new AdminQuery();
    DefaultTableModel Reservemodel = new DefaultTableModel();
    DefaultTableModel Roommodel = new DefaultTableModel();
    DefaultTableModel Accountmodel = new DefaultTableModel();
    
    
    //this array serves as the columns for reservations
    String[] ReserveColumn = {"ReserveNo","Reservee Name", "Package","Room Number", 
            "Check-In Date", "Check-Out Date", "Days of Stay", "No. of Guests", "Price"};
    //this array serves as the columns for rooms
    String[] RoomColumn = {"RoomNo", "Package", "No of Reservations"};
    //this array serves as the columns for account
    String[] AccountColumn = {"Account Number", "Email", "Username", "Age", "Gender" ,"Account Type"};
    
    int id = 0;
    //from log in page, it passes the account id to
    //this class to identify account informations
    public Adminpage(int id) {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("OptionPane.messageForeground", Color.black );
        UI.put("Panel.background", Color.TRANSLUCENT);
        
        
        this.id = id;
        
        
        //sets the text of the label to username
        userLBL.setText("Hello ADMIN! "+ lg.lq.getUsername(id));
        
        //sets the columns of the tables from initialized
        // values of arrays above
        Reservemodel.setColumnIdentifiers(ReserveColumn);
        Roommodel.setColumnIdentifiers(RoomColumn);
        Accountmodel.setColumnIdentifiers(AccountColumn);
        
        //these 3 methods are used to display the informations
        //from the database to this adminpage tables
        getReserveResult();
        getRoomsResult();
        getAccountsResult();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPNL = new javax.swing.JPanel();
        exitBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        ReservationsTABPNE = new javax.swing.JTabbedPane();
        ReservationPNL = new javax.swing.JPanel();
        ReserveSCRLLPNL = new javax.swing.JScrollPane();
        ReserveTBL = new javax.swing.JTable();
        deleteReserveBTN = new javax.swing.JButton();
        addReserveBTN = new javax.swing.JButton();
        refreshBTN = new javax.swing.JButton();
        updateRowBTN = new javax.swing.JButton();
        RoomsPNL = new javax.swing.JPanel();
        roomsSCRLLPNL = new javax.swing.JScrollPane();
        RoomTBL = new javax.swing.JTable();
        checkAvailableRoomsBTN = new javax.swing.JButton();
        roomsRefreshBTN = new javax.swing.JButton();
        seeReservationBTN = new javax.swing.JButton();
        AccountsPNL = new javax.swing.JPanel();
        accountsSCRLLPNL = new javax.swing.JScrollPane();
        AccountTBL = new javax.swing.JTable();
        promoteBTN = new javax.swing.JButton();
        demoteBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        userLBL = new javax.swing.JLabel();
        AzureLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(854, 480));

        bodyPNL.setBackground(new java.awt.Color(0, 0, 153));

        exitBTN.setBackground(new java.awt.Color(255, 51, 0));
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        logoutBTN.setBackground(new java.awt.Color(204, 0, 51));
        logoutBTN.setForeground(new java.awt.Color(255, 255, 255));
        logoutBTN.setText("Logout");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        ReservationsTABPNE.setBackground(new java.awt.Color(255, 255, 255));

        ReservationPNL.setOpaque(false);

        ReserveSCRLLPNL.setOpaque(false);

        ReserveTBL.setModel(Reservemodel);
        ReserveTBL.setDefaultEditor(Object.class, null);
        ReserveTBL.setOpaque(false);
        ReserveTBL.getTableHeader().setReorderingAllowed(false);
        ReserveTBL.setRowHeight (30);
        ReserveSCRLLPNL.setViewportView(ReserveTBL);

        deleteReserveBTN.setBackground(new java.awt.Color(255, 255, 255));
        deleteReserveBTN.setText("Delete Selected Row");
        deleteReserveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteReserveBTNActionPerformed(evt);
            }
        });

        addReserveBTN.setBackground(new java.awt.Color(255, 255, 255));
        addReserveBTN.setText("Add Row");
        addReserveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReserveBTNActionPerformed(evt);
            }
        });

        refreshBTN.setBackground(new java.awt.Color(255, 255, 255));
        refreshBTN.setText("Refresh");
        refreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTNActionPerformed(evt);
            }
        });

        updateRowBTN.setBackground(new java.awt.Color(255, 255, 255));
        updateRowBTN.setText("Update Selected Row");
        updateRowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRowBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReservationPNLLayout = new javax.swing.GroupLayout(ReservationPNL);
        ReservationPNL.setLayout(ReservationPNLLayout);
        ReservationPNLLayout.setHorizontalGroup(
            ReservationPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReservationPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReserveSCRLLPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ReservationPNLLayout.createSequentialGroup()
                        .addComponent(refreshBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addReserveBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteReserveBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateRowBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReservationPNLLayout.setVerticalGroup(
            ReservationPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReservationPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteReserveBTN)
                    .addComponent(addReserveBTN)
                    .addComponent(refreshBTN)
                    .addComponent(updateRowBTN))
                .addGap(18, 18, 18)
                .addComponent(ReserveSCRLLPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ReservationsTABPNE.addTab("Reservations", ReservationPNL);

        RoomsPNL.setOpaque(false);

        roomsSCRLLPNL.setOpaque(false);

        RoomTBL.setModel(Roommodel);
        RoomTBL.setOpaque(false);
        RoomTBL.setDefaultEditor(Object.class, null);
        RoomTBL.setOpaque(false);
        RoomTBL.getTableHeader().setReorderingAllowed(false);

        RoomTBL.setRowHeight (30);
        roomsSCRLLPNL.setViewportView(RoomTBL);

        checkAvailableRoomsBTN.setBackground(new java.awt.Color(255, 255, 255));
        checkAvailableRoomsBTN.setText("Check Available Rooms");
        checkAvailableRoomsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAvailableRoomsBTNActionPerformed(evt);
            }
        });

        roomsRefreshBTN.setBackground(new java.awt.Color(255, 255, 255));
        roomsRefreshBTN.setText("Refresh");
        roomsRefreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsRefreshBTNActionPerformed(evt);
            }
        });

        seeReservationBTN.setBackground(new java.awt.Color(255, 255, 255));
        seeReservationBTN.setText("See Reservation/s");
        seeReservationBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeReservationBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomsPNLLayout = new javax.swing.GroupLayout(RoomsPNL);
        RoomsPNL.setLayout(RoomsPNLLayout);
        RoomsPNLLayout.setHorizontalGroup(
            RoomsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomsSCRLLPNL, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(RoomsPNLLayout.createSequentialGroup()
                        .addComponent(roomsRefreshBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkAvailableRoomsBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seeReservationBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RoomsPNLLayout.setVerticalGroup(
            RoomsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomsPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAvailableRoomsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomsRefreshBTN)
                    .addComponent(seeReservationBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomsSCRLLPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ReservationsTABPNE.addTab("Rooms", RoomsPNL);

        AccountsPNL.setOpaque(false);

        accountsSCRLLPNL.setOpaque(false);

        AccountTBL.setModel(Accountmodel);
        AccountTBL.setDefaultEditor(Object.class, null);
        AccountTBL.setOpaque(false);
        AccountTBL.getTableHeader().setReorderingAllowed(false);
        AccountTBL.getTableHeader().setReorderingAllowed(false);
        AccountTBL.setRowHeight (30);
        accountsSCRLLPNL.setViewportView(AccountTBL);

        promoteBTN.setBackground(new java.awt.Color(255, 255, 255));
        promoteBTN.setText("Promote Selected Row to ADMIN");
        promoteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoteBTNActionPerformed(evt);
            }
        });

        demoteBTN.setBackground(new java.awt.Color(255, 255, 255));
        demoteBTN.setText("Demote Selected Row to USER");
        demoteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountsPNLLayout = new javax.swing.GroupLayout(AccountsPNL);
        AccountsPNL.setLayout(AccountsPNLLayout);
        AccountsPNLLayout.setHorizontalGroup(
            AccountsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountsSCRLLPNL, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(AccountsPNLLayout.createSequentialGroup()
                        .addComponent(promoteBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(demoteBTN)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AccountsPNLLayout.setVerticalGroup(
            AccountsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsPNLLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(AccountsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promoteBTN)
                    .addComponent(demoteBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountsSCRLLPNL, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        ReservationsTABPNE.addTab("Accounts", AccountsPNL);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        userLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userLBL.setForeground(new java.awt.Color(255, 255, 255));
        userLBL.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AzureLBL.setFont(new java.awt.Font("Freestyle Script", 1, 55)); // NOI18N
        AzureLBL.setForeground(new java.awt.Color(255, 255, 255));
        AzureLBL.setText("Azure Urban Residences");

        javax.swing.GroupLayout bodyPNLLayout = new javax.swing.GroupLayout(bodyPNL);
        bodyPNL.setLayout(bodyPNLLayout);
        bodyPNLLayout.setHorizontalGroup(
            bodyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReservationsTABPNE, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AzureLBL)
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(bodyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyPNLLayout.createSequentialGroup()
                    .addGap(746, 746, 746)
                    .addGroup(bodyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        bodyPNLLayout.setVerticalGroup(
            bodyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPNLLayout.createSequentialGroup()
                .addGroup(bodyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPNLLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AzureLBL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReservationsTABPNE)
                .addContainerGap())
            .addGroup(bodyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyPNLLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(exitBTN)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(logoutBTN)
                    .addContainerGap(551, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPNL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPNL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //this action/button logs out the admin and disposes this window,
    // goes back to login page
    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        
        int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?",
                "Thank you for signing in!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res == JOptionPane.YES_OPTION){
            
            this.dispose();
            lg.id = 0;
            lg.setVisible(true);
            
        }
    }//GEN-LAST:event_logoutBTNActionPerformed

    // this action ends the system
    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed
    
    //button from reservation tab
    //this action deletes the selected row from reservation table
    private void deleteReserveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteReserveBTNActionPerformed
        //if there's no selected row, the else statement
        // pops up
        if(ReserveTBL.getSelectedRow() >= 0){
            int RId = (int) ReserveTBL.getValueAt(ReserveTBL.getSelectedRow(), 0);
            aq.deleteReservation(RId);
            getReserveResult();
            
        }
        else {
        
            JOptionPane.showMessageDialog(null, "Please select a row to delete first!");
        
        }
        
    }//GEN-LAST:event_deleteReserveBTNActionPerformed

    //button from reservation tab
    //this action calls the AddRow class that performs
    //the adding of the rows
    private void addReserveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReserveBTNActionPerformed
 
            AddRow addRow = new AddRow(id, this);
            addRow.setVisible(true);
            
    }//GEN-LAST:event_addReserveBTNActionPerformed

    //button from reservation tab
    //this button clears the table's info and
    //adds the info again from the database
    private void refreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTNActionPerformed
        getReserveResult();
    }//GEN-LAST:event_refreshBTNActionPerformed

    //button from reservation tab
    //this action calls the UpdateRow class if there is
    // a selected row
    private void updateRowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRowBTNActionPerformed
        
        if(ReserveTBL.getSelectedRow() >= 0){

                int RId = (int) ReserveTBL.getValueAt(ReserveTBL.getSelectedRow(), 0);
                String name = (String) ReserveTBL.getValueAt(ReserveTBL.getSelectedRow(), 1);
                
                UpdateRow UR = new UpdateRow(RId, name, this);
                UR.setVisible(true);
                  
        }
        else {
        
            JOptionPane.showMessageDialog(null, "Please select a row to update first!");
        
        }
        
    }//GEN-LAST:event_updateRowBTNActionPerformed

    //button from rooms tab
    //this action calls the method from ClientQuerys
    // which displays the number of available rooms
    private void checkAvailableRoomsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAvailableRoomsBTNActionPerformed
        aq.cq.DisplayAvailableRooms(1);
    }//GEN-LAST:event_checkAvailableRoomsBTNActionPerformed

    //button from accounts tab
    //this action promotes a user to admin if there is
    // a selected row and the selected row is not an
    // admin
    private void promoteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promoteBTNActionPerformed
        
        if(AccountTBL.getSelectedRow() >= 0){
            
            int RId = Integer.parseInt(AccountTBL.getValueAt(AccountTBL.getSelectedRow(), 0).toString());
            aq.Promote(RId);
            getAccountsResult();
            
        }
        else {
        
            JOptionPane.showMessageDialog(null, "Please select a row to Promote first!");
        
        }
        
    }//GEN-LAST:event_promoteBTNActionPerformed

    //button from accounts tab
    //this action changes the account type to user
    // if the selected row is an admin
    private void demoteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoteBTNActionPerformed
        
        if(AccountTBL.getSelectedRow() >= 0){
            
            int RId = Integer.parseInt(AccountTBL.getValueAt(AccountTBL.getSelectedRow(), 0).toString());
            aq.Demote(RId);
            getAccountsResult();
            
        }
        else {
        
            JOptionPane.showMessageDialog(null, "Please select a row to Demote first!");
        
        }
        
    }//GEN-LAST:event_demoteBTNActionPerformed

    //button from reservation tab
    //this button clears the table's info and
    //adds the info again from the database
    private void roomsRefreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsRefreshBTNActionPerformed
        getRoomsResult();
    }//GEN-LAST:event_roomsRefreshBTNActionPerformed

    //this button calls the see reservation window to show
    // all the reservations on the selected row/room
    private void seeReservationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeReservationBTNActionPerformed

        if(RoomTBL.getSelectedRow() >= 0){
            String RoomNo = (RoomTBL.getValueAt(RoomTBL.getSelectedRow(), 0)).toString();
            if(!aq.getRoomReservations(RoomNo).isEmpty()){
                
                SeeReservation sr = new SeeReservation(RoomNo, aq.getRoomReservations(RoomNo));
            
            sr.setVisible(true);}
            else {
            
                JOptionPane.showMessageDialog(null, "The selected Room does not have any reservations yet!");
                
            }
            
            
        }
        else {
        
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        
        }
    }//GEN-LAST:event_seeReservationBTNActionPerformed

    //this method clears the Reservation table from admin page
    //and adds fresh results from database
    // to reservation table from admin page
    public void getReserveResult(){

        while(Reservemodel.getRowCount() > 0)
        {
            Reservemodel.removeRow(0);
        }

        for(int i = 0; i < aq.ReservationCounts(); i++){ 
        
            Reservemodel.addRow(aq.reservationsTableInfo()[i]);
        
        }
    
    }
    
    //this method clears the rooms table from admin page
    //and adds fresh results from database
    // to rooms table from admin page
    private void getRoomsResult(){
        
        while(Roommodel.getRowCount() > 0)
        {
            Roommodel.removeRow(0);
        }

        for(int i = 0; i < aq.RoomCounts(); i++){ 
        
            Roommodel.addRow(aq.roomTableInfo()[i]);
        
        }
    
    }

    //this method clears the accounts table from admin page
    //and adds fresh information results from database
    // to accounts table from admin page
    private void getAccountsResult(){
        
        while(Accountmodel.getRowCount() > 0)
        {
            Accountmodel.removeRow(0);
        }
        
        for(int i = 0; i < aq.AccountCounts(id); i++){ 
        
            Accountmodel.addRow(aq.accountTableInfo(id)[i]);
        
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccountTBL;
    private javax.swing.JPanel AccountsPNL;
    private javax.swing.JLabel AzureLBL;
    private javax.swing.JPanel ReservationPNL;
    private javax.swing.JTabbedPane ReservationsTABPNE;
    private javax.swing.JScrollPane ReserveSCRLLPNL;
    private javax.swing.JTable ReserveTBL;
    private javax.swing.JTable RoomTBL;
    private javax.swing.JPanel RoomsPNL;
    private javax.swing.JScrollPane accountsSCRLLPNL;
    private javax.swing.JButton addReserveBTN;
    private javax.swing.JPanel bodyPNL;
    private javax.swing.JButton checkAvailableRoomsBTN;
    private javax.swing.JButton deleteReserveBTN;
    private javax.swing.JButton demoteBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton promoteBTN;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JButton roomsRefreshBTN;
    private javax.swing.JScrollPane roomsSCRLLPNL;
    private javax.swing.JButton seeReservationBTN;
    private javax.swing.JButton updateRowBTN;
    private javax.swing.JLabel userLBL;
    // End of variables declaration//GEN-END:variables
}
