
package school;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchStudent extends javax.swing.JFrame {

    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public SearchStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jbtnBack = new javax.swing.JLabel();
        jbtnBacks = new javax.swing.JLabel();
        jtxtSearch = new javax.swing.JTextField();
        jbtnSearches = new javax.swing.JPanel();
        jbtnSearch = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pDTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Search Student Record");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 30, 297, -1));

        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel7.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1202, 11, -1, -1));

        jbtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBackMouseClicked(evt);
            }
        });
        jPanel7.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1148, 11, -1, -1));

        jbtnBacks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnBacks.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jbtnBacks.setText("Back");
        jbtnBacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBacksMouseClicked(evt);
            }
        });
        jPanel7.add(jbtnBacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 110, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1340, 70));

        jtxtSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSearchActionPerformed(evt);
            }
        });
        jtxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtSearchKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 500, 40));

        jbtnSearches.setBackground(new java.awt.Color(0, 204, 204));
        jbtnSearches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSearchesMouseClicked(evt);
            }
        });

        jbtnSearch.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSearch.setText("Search");
        jbtnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jbtnSearchesLayout = new javax.swing.GroupLayout(jbtnSearches);
        jbtnSearches.setLayout(jbtnSearchesLayout);
        jbtnSearchesLayout.setHorizontalGroup(
            jbtnSearchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbtnSearchesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jbtnSearch)
                .addGap(19, 19, 19))
        );
        jbtnSearchesLayout.setVerticalGroup(
            jbtnSearchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtnSearchesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jbtnSearches, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, -1, -1));

        pDTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Id", "Name", "Age", "Course", "Laptops", "Time in", "Time out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(pDTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 980, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Search by...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Student Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        Main school = new Main();
        school.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBackMouseClicked
        StudentDetails school = new StudentDetails();
        school.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnBackMouseClicked

    private void jtxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSearchActionPerformed

    private void jtxtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSearchKeyPressed

    private void jbtnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSearchMouseClicked
       
    }//GEN-LAST:event_jbtnSearchMouseClicked

    private void jbtnSearchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSearchesMouseClicked
        
    }//GEN-LAST:event_jbtnSearchesMouseClicked

    private void jbtnBacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBacksMouseClicked
       StudentDetails school = new StudentDetails();
        school.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnBacksMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new SearchStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbtnBack;
    private javax.swing.JLabel jbtnBacks;
    private javax.swing.JLabel jbtnSearch;
    private javax.swing.JPanel jbtnSearches;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTable pDTable1;
    // End of variables declaration//GEN-END:variables

    private static class defaultTableModel {

        private static Object getDataVector() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void fireTableDataChanged() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void addRow(Object[] columnData) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public defaultTableModel() {
        }
    }
}
