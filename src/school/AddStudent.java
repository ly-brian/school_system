
package school;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

    private Connection connection;
    private PreparedStatement prp;
    
    
    public AddStudent() {
        initComponents();
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jbtnExit1 = new javax.swing.JLabel();
        jbtnBack1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLaptops = new javax.swing.JComboBox<>();
        County = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTin = new javax.swing.JTextField();
        jbtnBack = new javax.swing.JLabel();
        jbtnClearAll = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jtxtGender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTout = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Add Student");

        jbtnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnExit1MouseClicked(evt);
            }
        });

        jbtnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBack1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addComponent(jbtnBack1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnBack1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnExit1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 1190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 154, 80, -1));

        jtxtDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDateActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 149, 149, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 209, 80, -1));

        jtxtId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 204, 149, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 264, 80, -1));

        jtxtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 261, 149, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 321, 80, -1));

        jtxtAge.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 316, 149, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Course");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 378, 80, -1));

        txtLaptops.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtLaptops.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hp", "lenovo", "Dell", "acer", "Microsoft", "Toshiba", "Samsung", " " }));
        txtLaptops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaptopsActionPerformed(evt);
            }
        });
        jPanel1.add(txtLaptops, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 170, 30));

        County.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        County.setForeground(new java.awt.Color(0, 153, 153));
        County.setText("Laptop");
        jPanel1.add(County, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 136, 110, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Time in");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 209, 135, 40));

        txtTin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTin.setToolTipText("");
        txtTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTinActionPerformed(evt);
            }
        });
        jPanel1.add(txtTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 212, 170, 30));

        jbtnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jbtnBack.setText("Back");
        jbtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBackMouseClicked(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 100, 110, 70));

        jbtnClearAll.setBackground(new java.awt.Color(0, 102, 102));
        jbtnClearAll.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnClearAll.setForeground(new java.awt.Color(255, 255, 255));
        jbtnClearAll.setText("Clear");
        jbtnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearAllActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 120, 50));

        jbtnSave.setBackground(new java.awt.Color(0, 102, 102));
        jbtnSave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnSave.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 120, 50));

        jtxtGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bcs", "Dcs", "Dics", "Bbit", "Ccs", "It", "Dit", " " }));
        jtxtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 375, 149, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Time out");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 135, 40));

        txtTout.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTout.setToolTipText("");
        txtTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToutActionPerformed(evt);
            }
        });
        jPanel1.add(txtTout, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1400, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExit1MouseClicked
        Main school = new Main();
        school.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnExit1MouseClicked

    private void jbtnBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBack1MouseClicked
        Main school = new Main();
        school.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnBack1MouseClicked

    private void jtxtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDateActionPerformed

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jtxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAgeActionPerformed

    private void txtLaptopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaptopsActionPerformed

    }//GEN-LAST:event_txtLaptopsActionPerformed

    private void txtTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTinActionPerformed

    private void jbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBackMouseClicked
        StudentDetails obj = new StudentDetails();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnBackMouseClicked

    private void jbtnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearAllActionPerformed
       jtxtDate.setText("");
        jtxtName.setText("");
        jtxtAge.setText("");
        jtxtId.setText("");
        txtTin.setText("");
        txtLaptops.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnClearAllActionPerformed

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        
         Connection conn = Connector.ConnectDb();
        if (connection != null) {
            String date = jtxtDate.getText();
            String id = jtxtId.getText();
            String name = jtxtName.getText();
            String age = jtxtAge.getText();
            String gender = (String) jtxtGender.getSelectedItem();
            String county = (String) txtLaptops.getSelectedItem();
            String phone = txtTin.getText();
            String sql = "insert into student_reg(date,id,name,age,gender,county,phone) values (?,?,?,?,?,?,?)";
            try {
                
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setString(4, age);
                prp.setString(5, gender);
                prp.setString(6, county);
                prp.setString(7, phone);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
            } catch (SQLException e) {
            }
        }
        
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jtxtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtGenderActionPerformed

    private void txtToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToutActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new AddStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel County;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jbtnBack;
    private javax.swing.JLabel jbtnBack1;
    private javax.swing.JButton jbtnClearAll;
    private javax.swing.JLabel jbtnExit1;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtDate;
    private javax.swing.JComboBox<String> jtxtGender;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JComboBox<String> txtLaptops;
    private javax.swing.JTextField txtTin;
    private javax.swing.JTextField txtTout;
    // End of variables declaration//GEN-END:variables
}
