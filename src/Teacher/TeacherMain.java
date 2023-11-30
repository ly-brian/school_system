
package Teacher;

public class TeacherMain extends javax.swing.JFrame {

    
    public TeacherMain() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jbtnAcademic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(966, 523));
        setMinimumSize(new java.awt.Dimension(966, 523));
        setPreferredSize(new java.awt.Dimension(966, 523));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Teacher Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 48))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("Transcript");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 170, 39));

        jbtnAcademic.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnAcademic.setText("Academic ");
        jbtnAcademic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcademicActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAcademic, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 293, 170, 39));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 36, 900, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAcademicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcademicActionPerformed
        
        Academic obj = new Academic();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAcademicActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new TeacherMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAcademic;
    // End of variables declaration//GEN-END:variables
}
