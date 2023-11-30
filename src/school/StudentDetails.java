
package school;

public class StudentDetails extends javax.swing.JFrame {

    public StudentDetails() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbtnDelete = new javax.swing.JButton();
        jbtnBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 247, 213));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Student Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnAdd.setText("Add Student");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addstudent.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatestudent.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 60, 60));

        jbtnUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchstudent.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 60, 60));

        jbtnSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 110, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/deletestudent.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 300, 60, 60));

        jbtnDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 110, 30));

        jbtnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jbtnBack.setText("Back");
        jbtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBackMouseClicked(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 80, 120, 90));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Record officer ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("area");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("only");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBackMouseClicked
       Main obj = new Main();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jbtnBackMouseClicked

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        AddStudent obj = new AddStudent();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        UpdateStudent obj = new UpdateStudent();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        SearchStudent obj = new SearchStudent();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DeleteStudent obj = new DeleteStudent();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new StudentDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JLabel jbtnBack;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnUpdate;
    // End of variables declaration//GEN-END:variables
}
