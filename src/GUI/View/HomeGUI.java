package GUI.View;


public class HomeGUI extends javax.swing.JFrame {
    
    public HomeGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Admin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/user.png"))); // NOI18N
        User.setText(" ");
        User.setBorderPainted(false);
        User.setContentAreaFilled(false);
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        User.setInheritsPopupMenu(true);
        User.setMaximumSize(new java.awt.Dimension(100, 100));
        User.setMinimumSize(new java.awt.Dimension(100, 100));
        User.setPreferredSize(new java.awt.Dimension(100, 100));
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 190, 200));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MIRËSERDHËT NË HOTEL EMERALD!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Administrator");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/admin.png"))); // NOI18N
        Admin.setText(" ");
        Admin.setBorderPainted(false);
        Admin.setContentAreaFilled(false);
        Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Admin.setInheritsPopupMenu(true);
        Admin.setMargin(new java.awt.Insets(2, 25, 2, 14));
        Admin.setMaximumSize(new java.awt.Dimension(100, 100));
        Admin.setMinimumSize(new java.awt.Dimension(100, 100));
        Admin.setPreferredSize(new java.awt.Dimension(100, 100));
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, 200));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Klient");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Përdor aplikacionin si:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        background.setBackground(new java.awt.Color(255, 204, 0));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/hotel3.jpg"))); // NOI18N
        background.setText(" ");
        background.setToolTipText("");
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.setOpaque(true);
        background.setPreferredSize(new java.awt.Dimension(700, 440));
        background.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
      
       LogInGUI am = new LogInGUI();
        am.setVisible(true);
    }//GEN-LAST:event_AdminActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
       LogInGUI1 am = new LogInGUI1();
        am.setVisible(true);
       
    }//GEN-LAST:event_UserActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton User;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
