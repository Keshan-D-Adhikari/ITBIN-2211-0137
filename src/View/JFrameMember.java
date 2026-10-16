/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.MemeberController;
import controller.util.CommonUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MemberModel;

/**
 *
 * @author keshan
 */
public class JFrameMember extends javax.swing.JFrame {

    /**
     * Creates new form Member
     */
    MemeberController controller;
    CommonUtils commonUtils;
    String[] columnNames = {"member_id", "name", "mobile_number", "birthday"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

    public JFrameMember() {
        initComponents();

        windoeCloseEvent();

        controller = new MemeberController();
        commonUtils = new CommonUtils();

        initDataLoading();
    }

    private void windoeCloseEvent() {
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                int showConfirmDialog = JOptionPane.showConfirmDialog(JFrameMember.this, "Do you want close this window?", "Close", JOptionPane.WARNING_MESSAGE);
                if (showConfirmDialog == 0) {
                    new JFrameHome().setVisible(true);
                    JFrameMember.this.hide();

                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldMemberId = new javax.swing.JTextField();
        jTextFieldMobile = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooserBirthDay = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText("Member");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Member");
        setMinimumSize(new java.awt.Dimension(1462, 560));
        setSize(new java.awt.Dimension(1470, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setText("Member");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel2)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jLabel3.setText("Name");

        jLabel4.setText("Member ID");

        jLabel5.setText("Birthday");

        jLabel6.setText("Gender");

        jLabel7.setText("Mobile Number");

        jTextFieldMemberId.setEditable(false);

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel8.setText("Email");

        jDateChooserBirthDay.setDateFormatString("yyyy-MM-dd");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (12).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (11).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (21).png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (25).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (20).png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (23).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (18).png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/button (24).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jButton3))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(35, 35, 35)
                        .addComponent(jButton6))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooserBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton5)))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 640, 390));

        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableMembers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        commonUtils.resetComponents(new JComponent[]{jTextFieldName, jDateChooserBirthDay, jComboBoxGender, jTextFieldMobile, jTextFieldEmail});
        setNewMemberId();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String SelectedMemberId = (String) tableModel.getValueAt(jTableMembers.getSelectedRow(), 0);
        System.out.println("valuee===" + SelectedMemberId);

        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Do you want Delete Selected Member?", "Delete", JOptionPane.WARNING_MESSAGE);
        if (showConfirmDialog == 0) {

            try {
                int deleteMember = controller.deleteMember(SelectedMemberId);
                if (deleteMember == 1) {
                    JOptionPane.showMessageDialog(this, "Data delete succesful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    ((DefaultTableModel) jTableMembers.getModel()).removeRow(jTableMembers.getSelectedRow());
                    commonUtils.resetComponents(new JComponent[]{jTextFieldName, jDateChooserBirthDay, jComboBoxGender, jTextFieldMobile, jTextFieldEmail});
                     setNewMemberId();
                } else {
                    JOptionPane.showMessageDialog(this, "Data delete fsiled!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (jTextFieldName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLease enter valid Name", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jComboBoxGender.getSelectedItem().toString().equals("--")) {
                JOptionPane.showMessageDialog(this, "PLease select valid Gender", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jTextFieldMobile.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLease enter valid Mobile", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jTextFieldEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLease enter valid Email", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String BirthDay = CommonUtils.getStringDate(jDateChooserBirthDay.getDate());

                MemberModel member = new MemberModel();
                member.setMemberId(jTextFieldMemberId.getText());
                member.setName(jTextFieldName.getText());
                member.setBirthday(BirthDay);
                member.setGender(jComboBoxGender.getSelectedItem().toString());
                member.setMobileNumber(jTextFieldMobile.getText());
                member.setEmail(jTextFieldEmail.getText());

                int isSaved = controller.updateMember(member);

                commonUtils.DatabaseFunctionalityMessages(this, isSaved);

                commonUtils.resetComponents(new JComponent[]{jTextFieldName, jDateChooserBirthDay, jComboBoxGender, jTextFieldMobile, jTextFieldEmail});
                initDataLoading();
            }

        } catch (SQLException ex) {
            Logger.getLogger(JFrameMember.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            if (jTextFieldName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLease enter valid Name", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jComboBoxGender.getSelectedItem().toString().equals("--")) {
                JOptionPane.showMessageDialog(this, "PLease select valid Gender", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jTextFieldMobile.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLease enter valid Mobile", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jTextFieldEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLease enter valid Email", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String BirthDay = CommonUtils.getStringDate(jDateChooserBirthDay.getDate());

                MemberModel member = new MemberModel();
                member.setMemberId(jTextFieldMemberId.getText());
                member.setName(jTextFieldName.getText());
                member.setBirthday(BirthDay);
                member.setGender(jComboBoxGender.getSelectedItem().toString());
                member.setMobileNumber(jTextFieldMobile.getText());
                member.setEmail(jTextFieldEmail.getText());

                int isSaved = controller.saveMember(member);

                commonUtils.DatabaseFunctionalityMessages(this, isSaved);

                commonUtils.resetComponents(new JComponent[]{jTextFieldName, jDateChooserBirthDay, jComboBoxGender, jTextFieldMobile, jTextFieldEmail});
                initDataLoading();
            }

        } catch (SQLException ex) {
            Logger.getLogger(JFrameMember.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMemberId;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    private void initDataLoading() {
        jDateChooserBirthDay.setDate(new Date());
        setNewMemberId();
        initMembersData();
    }

    private void setNewMemberId() {
        try {
            jTextFieldMemberId.setText(controller.getNewMemberId());

        } catch (SQLException ex) {
            Logger.getLogger(JFrameMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initMembersData() {
        try {
            tableModel = new DefaultTableModel(columnNames, 0);
            ResultSet rs = controller.getAllMembers();
            while (rs.next()) {
                String memberId = rs.getString("member_id");
                String name = rs.getString("name");
                String mobileNumber = rs.getString("mobile_number");
                String birthday = rs.getString("birthday");

                String[] data = {memberId, name, mobileNumber, birthday};

                tableModel.addRow(data);
            }

            jTableMembers.setModel(tableModel);
            
             jTableMembers.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                        int row = jTableMembers.rowAtPoint(e.getPoint());
                        // Check if a row is selected
                        if (row >= 0 && row < jTableMembers.getRowCount()) {
                            jTableMembers.setRowSelectionInterval(row, row);
                            // Show the popup menu
                             String SelectedMemberId = (String) tableModel.getValueAt(jTableMembers.getSelectedRow(), 0);
                    try {
                        ResultSet book = controller.getMemberByID(SelectedMemberId);
                        while (book.next()) {
                            //`name`, `member_id`, `birthday`, `gender`, `mobile_number`, `email`
                            jTextFieldName.setText(book.getString(1));

                            jTextFieldMemberId.setText(book.getString(2));
                            jTextFieldMemberId.setEditable(false);
                            
                            jDateChooserBirthDay.setDate(book.getDate(3));
                            
                            jComboBoxGender.setSelectedItem(book.getString(4));
                            

                            jTextFieldMobile.setText(book.getString(5));
                            jTextFieldEmail.setText(book.getString(6));
                             
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                        }
                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(JFrameMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
