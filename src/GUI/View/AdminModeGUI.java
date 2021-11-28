package GUI.View;

public class AdminModeGUI extends javax.swing.JFrame {

    
    public AdminModeGUI() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        stafRoom = new javax.swing.JButton();
        stafi = new javax.swing.JButton();
        room = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Food = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dhoma");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        stafRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/stafiRoom.png"))); // NOI18N
        stafRoom.setText(" ");
        stafRoom.setBorderPainted(false);
        stafRoom.setContentAreaFilled(false);
        stafRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        stafRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stafRoom.setInheritsPopupMenu(true);
        stafRoom.setMaximumSize(new java.awt.Dimension(100, 100));
        stafRoom.setMinimumSize(new java.awt.Dimension(100, 100));
        stafRoom.setPreferredSize(new java.awt.Dimension(100, 100));
        stafRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stafRoomActionPerformed(evt);
            }
        });
        getContentPane().add(stafRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 150, 150));

        stafi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/stafi1.png"))); // NOI18N
        stafi.setText(" ");
        stafi.setBorderPainted(false);
        stafi.setContentAreaFilled(false);
        stafi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        stafi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stafi.setInheritsPopupMenu(true);
        stafi.setMaximumSize(new java.awt.Dimension(100, 100));
        stafi.setMinimumSize(new java.awt.Dimension(100, 100));
        stafi.setPreferredSize(new java.awt.Dimension(100, 100));
        stafi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stafiActionPerformed(evt);
            }
        });
        getContentPane().add(stafi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, 140));

        room.setBackground(new java.awt.Color(51, 51, 51));
        room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/room.png"))); // NOI18N
        room.setText(" ");
        room.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        room.setBorderPainted(false);
        room.setContentAreaFilled(false);
        room.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        room.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        room.setInheritsPopupMenu(true);
        room.setMaximumSize(new java.awt.Dimension(100, 100));
        room.setMinimumSize(new java.awt.Dimension(100, 100));
        room.setPreferredSize(new java.awt.Dimension(100, 100));
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });
        getContentPane().add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 140, 140));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stafi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dhomat e stafit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMINISTRATOR MODE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ushqim");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        Food.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/food.png"))); // NOI18N
        Food.setText(" ");
        Food.setBorderPainted(false);
        Food.setContentAreaFilled(false);
        Food.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Food.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Food.setInheritsPopupMenu(true);
        Food.setMargin(new java.awt.Insets(2, 25, 2, 14));
        Food.setMaximumSize(new java.awt.Dimension(100, 100));
        Food.setMinimumSize(new java.awt.Dimension(100, 100));
        Food.setPreferredSize(new java.awt.Dimension(100, 100));
        Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodActionPerformed(evt);
            }
        });
        getContentPane().add(Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 160, 140));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 970, 500));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        RoomGUI d = new RoomGUI();
       desktopPane.add(d);
        d.show();
        //setDefaultCloseOperation(RoomGUI.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_roomActionPerformed

    private void stafiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafiActionPerformed
        StafiGUI d = new StafiGUI();
        desktopPane.add(d);
        d.show();
    }//GEN-LAST:event_stafiActionPerformed

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        FoodMenuGUI d = new FoodMenuGUI();
        desktopPane.add(d);
        d.show();
    }//GEN-LAST:event_FoodActionPerformed

    private void stafRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafRoomActionPerformed
        DhomaStafitGUI d = new DhomaStafitGUI();
        desktopPane.add(d);
        d.show();
    }//GEN-LAST:event_stafRoomActionPerformed

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
            java.util.logging.Logger.getLogger(AdminModeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminModeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminModeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminModeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Food;
    private javax.swing.JLabel background;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton room;
    private javax.swing.JButton stafRoom;
    private javax.swing.JButton stafi;
    // End of variables declaration//GEN-END:variables
}
