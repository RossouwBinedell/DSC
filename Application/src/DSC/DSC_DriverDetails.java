
package DSC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aliens_Michael
 */
public class DSC_DriverDetails extends javax.swing.JFrame {

    boolean editClicked = false;
    int listIndex = 0;

    /**
     * Creates new form DSC_DriverDetails
     */
    public DSC_DriverDetails() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        disableFields();
        btnSave.setText("Save");
        btnSave.setVisible(false);
        txfDriverID.setEnabled(false);
        lstDrivers.setSelectedIndex(0);
    }

    public final void enableFields() {
        txfDriverName.setEnabled(true);
        txfDriverSurname.setEnabled(true);
        txfContactNo.setEnabled(true);
        txfAddress.setEnabled(true);
        txfVehicleReg.setEnabled(true);
    }

    public final void disableFields() {
        txfDriverName.setEnabled(false);
        txfDriverSurname.setEnabled(false);
        txfContactNo.setEnabled(false);
        txfAddress.setEnabled(false);
        txfVehicleReg.setEnabled(false);
    }

    public final void clearFields() {
        txfDriverID.setText(null);
        txfDriverName.setText(null);
        txfDriverSurname.setText(null);
        txfContactNo.setText(null);
        txfAddress.setText(null);
        txfVehicleReg.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlDrivers = new javax.swing.JPanel();
        lblDrivers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDrivers = new javax.swing.JList<>();
        btnAddDriver = new javax.swing.JButton();
        btnDeleteDriver = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();
        lblDriversDetails = new javax.swing.JLabel();
        lblDriverID = new javax.swing.JLabel();
        lblDriverName = new javax.swing.JLabel();
        lblDriverSurname = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblVehicleReg = new javax.swing.JLabel();
        txfDriverID = new javax.swing.JTextField();
        txfDriverName = new javax.swing.JTextField();
        txfDriverSurname = new javax.swing.JTextField();
        txfContactNo = new javax.swing.JTextField();
        txfAddress = new javax.swing.JTextField();
        txfVehicleReg = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Driver Details");

        pnlBackground.setBackground(new java.awt.Color(0, 153, 0));

        pnlDrivers.setBackground(new java.awt.Color(0, 204, 51));
        pnlDrivers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDrivers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrivers.setText("Drivers:");

        lstDrivers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstDrivers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstDrivers);

        btnAddDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Add.png"))); // NOI18N
        btnAddDriver.setText(" Add");
        btnAddDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDriverActionPerformed(evt);
            }
        });

        btnDeleteDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Bin.png"))); // NOI18N
        btnDeleteDriver.setText("Delete");
        btnDeleteDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDriverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDriversLayout = new javax.swing.GroupLayout(pnlDrivers);
        pnlDrivers.setLayout(pnlDriversLayout);
        pnlDriversLayout.setHorizontalGroup(
            pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDriversLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlDriversLayout.createSequentialGroup()
                        .addComponent(lblDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDriver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteDriver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDriversLayout.setVerticalGroup(
            pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDriversLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteDriver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlDetails.setBackground(new java.awt.Color(0, 204, 51));
        pnlDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDriversDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDriversDetails.setText("Driver's Details:");

        lblDriverID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDriverID.setText("Driver ID:");

        lblDriverName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDriverName.setText("Driver Name:");

        lblDriverSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDriverSurname.setText("Driver Surname:");

        lblContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContactNo.setText("Contact Number:");

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddress.setText("Address:");

        lblVehicleReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVehicleReg.setText("Vehicle Registration:");

        txfDriverID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDriverID.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txfDriverName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDriverName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txfDriverSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDriverSurname.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txfContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfContactNo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txfAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfAddress.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txfVehicleReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfVehicleReg.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Edit 2.png"))); // NOI18N
        btnEdit.setText(" Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Save 2.png"))); // NOI18N
        btnSave.setText(" Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDriversDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVehicleReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDriverSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDriverName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDriverID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDriverID)
                            .addComponent(txfDriverName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfDriverSurname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfVehicleReg, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDriversDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriverID)
                    .addComponent(txfDriverID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriverName)
                    .addComponent(txfDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriverSurname)
                    .addComponent(txfDriverSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleReg)
                    .addComponent(txfVehicleReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDrivers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        listIndex = lstDrivers.getSelectedIndex();
        enableFields();
        btnEdit.setEnabled(false);
        btnSave.setVisible(true);
        editClicked = true;
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (editClicked) {
            int ans = JOptionPane.showConfirmDialog(this, "Do you wish to discard unsaved changes?");
            switch (ans) {
                case JOptionPane.YES_OPTION:
                    btnSave.setVisible(false);
                    btnEdit.setEnabled(true);
                    disableFields();
                    lstDrivers.setSelectedIndex(listIndex);
                    editClicked = false;
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                default:
                    break;
            }
        } else {
            this.dispose();
            new DSC_DriverTable().setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean back = false;
        if (btnSave.getText().equals("Save")) {
            //Update existing driver
            short ID = Short.parseShort(txfDriverID.getText().trim());
            String newName = txfDriverName.getText().trim();
            String newSurname = txfDriverSurname.getText().trim();
            String newContactNo = txfContactNo.getText().trim();
            String newAddress = txfAddress.getText().trim();
            String newVehicleReg = txfVehicleReg.getText().trim();

            try {
//                Connection c = DBClass.getConnection();
//                
//                PreparedStatement stmt = c.prepareStatement
//        ("UPDATE doorstepchef.driver_tb SET DriverName = ?, DriverSurname = ?, ContactNumber = ?, Address = ?, VehicleReg = ? WHERE DriverID = ?;");
//                stmt.setString(1, newName);
//                stmt.setString(2, newSurname);
//                stmt.setString(3, newContactNo);
//                stmt.setString(4, newAddress);
//                stmt.setString(5, newVehicleReg);
//                stmt.setShort(6, ID);
//                stmt.executeUpdate();
//                
//                JOptionPane.showMessageDialog(this, "Changes Saved");
//                //Refresh
//                back = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (btnSave.getText().equals("Add")) {
            //Add new driver
            boolean empty = checkEmpty();
            if (empty) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                short newID = Short.parseShort(txfDriverID.getText().trim());
                String newName = txfDriverName.getText().trim();
                String newSurname = txfDriverSurname.getText().trim();
                String newContactNo = txfContactNo.getText().trim();
                String newAddress = txfAddress.getText().trim();
                String newVehicleReg = txfVehicleReg.getText().trim();

                String query = "INSERT INTO doorstepchef.driver_tb (`DriverID`, `DriverName`, `ContactNumber`, `Address`, `VehicleReg`, `DriverSurname`) \n"
                        + "	VALUES (" + newID + ", '" + newName + "', '" + newContactNo + "', '" + newAddress + "', '" + newVehicleReg + "', '" + newSurname + "');";

                try {
//                    Connection c = DBClass.getConnection();
//                    Statement stmt = c.createStatement();
//                    stmt.executeUpdate(query);
//                    JOptionPane.showMessageDialog(this, "New Driver Saved");
//                    back = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (back) {
            disableFields();
            btnSave.setVisible(false);
            btnEdit.setEnabled(true);
            editClicked = false;
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private boolean checkEmpty() {
        boolean empty = false;

        if (txfDriverName.getText().isEmpty() && txfDriverSurname.getText().isEmpty() && txfContactNo.getText().isEmpty()
                && txfAddress.getText().isEmpty() && txfVehicleReg.getText().isEmpty()) {
            empty = true;
        }

        return empty;
    }

    private void btnAddDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDriverActionPerformed
        clearFields();
        enableFields();
        btnEdit.setEnabled(false);
        btnSave.setText("Add");
        btnSave.setVisible(true);
        editClicked = true;

        String query = "SELECT MAX(DriverID) FROM doorstepchef.driver_tb;";
        ResultSet rs;
        int numRows = 0;

        try {
//            Connection c = DBClass.getConnection();
//            Statement stmt = c.createStatement();
//            rs = stmt.executeQuery(query);
//            rs.next();
//            numRows = rs.getInt(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        numRows += 1;
        txfDriverID.setText(numRows + "");

    }//GEN-LAST:event_btnAddDriverActionPerformed

    private void btnDeleteDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDriverActionPerformed
        String name = txfDriverName.getText() + " " + txfDriverSurname.getText();

        int driverID = Integer.parseInt(txfDriverID.getText());
        int elementIndex = lstDrivers.getSelectedIndex();

        String message = "Are you sure you want to delete " + name + "?";
        int answer = JOptionPane.showConfirmDialog(this, message, "Confirm", JOptionPane.INFORMATION_MESSAGE);

        switch (answer) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(this, name + " will be deleted", "Delete Notification", JOptionPane.INFORMATION_MESSAGE);

                try {
//                    Connection c = DBClass.getConnection();
//                    Statement stmt = c.createStatement();
//
//                    String update = "UPDATE route_tb SET DriverID = 0 WHERE DriverID = '" + driverID + "'";
//                    stmt.executeUpdate(update);
//
//                    String deleteDriver = "DELETE FROM doorstepchef.driver_tb WHERE DriverID LIKE '" + driverID + "'";
//                    stmt.executeUpdate(deleteDriver);
//
//                    JOptionPane.showMessageDialog(this, "Driver has been deleted. \nPlease note removing this driver has affected"
//                            + " \nroute schedules leaving routes without an assigned driver.");
//                    //refresh jList

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, name + " will not be deleted", "Delete Notification", JOptionPane.INFORMATION_MESSAGE);
                break;

            case JOptionPane.CANCEL_OPTION:

                break;
        }
    }//GEN-LAST:event_btnDeleteDriverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSC_DriverDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDriver;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDriver;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDriverID;
    private javax.swing.JLabel lblDriverName;
    private javax.swing.JLabel lblDriverSurname;
    private javax.swing.JLabel lblDrivers;
    private javax.swing.JLabel lblDriversDetails;
    private javax.swing.JLabel lblVehicleReg;
    private javax.swing.JList<String> lstDrivers;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlDrivers;
    private javax.swing.JTextField txfAddress;
    private javax.swing.JTextField txfContactNo;
    private javax.swing.JTextField txfDriverID;
    private javax.swing.JTextField txfDriverName;
    private javax.swing.JTextField txfDriverSurname;
    private javax.swing.JTextField txfVehicleReg;
    // End of variables declaration//GEN-END:variables
}
