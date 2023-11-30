
package Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Academic extends javax.swing.JFrame {

    private Connection connection;
    private PreparedStatement prp;
    public Academic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtAdm = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Academic Work", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 36))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jtxtAdm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtxtAdm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAdmKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1240, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 110, 30));

        jtxtName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Course");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 110, 30));

        jtxtGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bcs", "Dcs", "Dics", "Bbit", "Ccs", "It", "Dit", " " }));
        jtxtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 149, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtAdmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAdmKeyTyped
       char iNumber = evt.getKeyChar();
       if (!(Character.isDigit(iNumber)))
           
                   {
                       evt.consume();
                   }

    }//GEN-LAST:event_jtxtAdmKeyTyped

    private void jtxtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtGenderActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Academic().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtxtAdm;
    private javax.swing.JComboBox<String> jtxtGender;
    private javax.swing.JTextField jtxtName;
    // End of variables declaration//GEN-END:variables
}
