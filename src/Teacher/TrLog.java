
package Teacher;

import javax.swing.JOptionPane;
import school.Main;

public class TrLog extends javax.swing.JFrame {

    public TrLog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jtxtPassword = new javax.swing.JPasswordField();
        jbtnExit = new javax.swing.JButton();
        jbtnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Lecturer Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("User Id");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 119, 36));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 133, 119, 45));

        jtxtUsername.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel2.add(jtxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 44, 200, 36));

        jtxtPassword.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel2.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 133, 210, 40));

        jbtnExit.setBackground(new java.awt.Color(255, 255, 51));
        jbtnExit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, -1));

        jbtnOk.setBackground(new java.awt.Color(255, 255, 51));
        jbtnOk.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnOk.setText("OK");
        jbtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOkActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 670, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOkActionPerformed
       
        String Username = jtxtUsername.getText();
        String Password = jtxtPassword.getText();
        
        if(Password.contains("") && Username.contains(""))
        {
            jtxtUsername.setText(null);
            jtxtPassword.setText(null);
            TeacherMain obj = new TeacherMain();
            obj.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wrong Details", "School System", JOptionPane.ERROR_MESSAGE);
            jtxtUsername.setText(null);
            jtxtPassword.setText(null);
            jtxtUsername.grabFocus();
        }
        
    }//GEN-LAST:event_jbtnOkActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        Main obj = new Main();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new TrLog().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnOk;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}
