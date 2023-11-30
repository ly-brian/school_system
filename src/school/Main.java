package school;

import Teacher.TrLog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main extends javax.swing.JFrame {

    private JFrame frame;
    
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnRecord1 = new javax.swing.JButton();
        jbtnTeacher = new javax.swing.JButton();
        jbtnRecords = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 200, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 52)); // NOI18N
        jLabel1.setText("SCHOOL MANAGEMENT SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("S P U");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("to");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 290));

        jbtnRecord1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnRecord1.setText("Record Officer");
        jbtnRecord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnRecord1MouseClicked(evt);
            }
        });
        jbtnRecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRecord1ActionPerformed(evt);
            }
        });
        jbtnRecord1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnRecord1KeyPressed(evt);
            }
        });
        jPanel1.add(jbtnRecord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 150, 40));

        jbtnTeacher.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnTeacher.setText("Lecturer");
        jbtnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTeacherActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 150, 40));

        jbtnRecords.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnRecords.setText("News Letter");
        jPanel1.add(jbtnRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 150, 40));

        jLabel5.setBackground(new java.awt.Color(51, 102, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/appointment.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, 50, 60));

        jLabel6.setBackground(new java.awt.Color(51, 102, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 50, 60));

        jLabel7.setBackground(new java.awt.Color(51, 102, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 50, 60));

        Exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        Exit.setText("Close");
        Exit.setToolTipText("Close");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 130, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRecord1ActionPerformed
       StudentDetails obj = new StudentDetails();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jbtnRecord1ActionPerformed

    private void jbtnRecord1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnRecord1KeyPressed
       StudentDetails obj = new StudentDetails();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jbtnRecord1KeyPressed

    private void jbtnRecord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRecord1MouseClicked
       StudentDetails obj = new StudentDetails();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jbtnRecord1MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        frame = new JFrame("Close");
      if(JOptionPane.showConfirmDialog(frame, "Do you want to Close?", "School System.",
              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
      {
          dispose();
      }
    }//GEN-LAST:event_ExitMouseClicked

    private void jbtnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTeacherActionPerformed
        TrLog obj = new TrLog();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnTeacherActionPerformed

    
    public static void main(String args[])  throws ClassNotFoundException,InstantiationException, IllegalAccessException, 
           UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
       
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnRecord1;
    private javax.swing.JButton jbtnRecords;
    private javax.swing.JButton jbtnTeacher;
    // End of variables declaration//GEN-END:variables
}
