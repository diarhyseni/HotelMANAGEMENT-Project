
package GUI.View;

public class UserModeGUI extends javax.swing.JFrame {
    FileChooserDemo c = new FileChooserDemo();
    
    public UserModeGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ankesa = new javax.swing.JButton();
        Personi2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Food = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ankesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/ankesa.png"))); // NOI18N
        Ankesa.setText(" ");
        Ankesa.setBorderPainted(false);
        Ankesa.setContentAreaFilled(false);
        Ankesa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ankesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ankesa.setInheritsPopupMenu(true);
        Ankesa.setMargin(new java.awt.Insets(2, 25, 2, 14));
        Ankesa.setMaximumSize(new java.awt.Dimension(100, 100));
        Ankesa.setMinimumSize(new java.awt.Dimension(100, 100));
        Ankesa.setPreferredSize(new java.awt.Dimension(100, 100));
        Ankesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnkesaActionPerformed(evt);
            }
        });
        getContentPane().add(Ankesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 90, 90));

        Personi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/stafi.png"))); // NOI18N
        Personi2.setText(" ");
        Personi2.setBorderPainted(false);
        Personi2.setContentAreaFilled(false);
        Personi2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Personi2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Personi2.setInheritsPopupMenu(true);
        Personi2.setMaximumSize(new java.awt.Dimension(100, 100));
        Personi2.setMinimumSize(new java.awt.Dimension(100, 100));
        Personi2.setPreferredSize(new java.awt.Dimension(100, 100));
        Personi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Personi2ActionPerformed(evt);
            }
        });
        getContentPane().add(Personi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, 90));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rezervo vend në hotel");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ankesa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rezervo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

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
        getContentPane().add(Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 90, 90));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ushqim");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, -1, 20));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 140));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1320, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnkesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnkesaActionPerformed
        AnkesaGUI ag = new AnkesaGUI();
        desktopPane.add(ag);
        ag.show();
       
        
    }//GEN-LAST:event_AnkesaActionPerformed

    private void Personi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Personi2ActionPerformed
        PersoniGUI pf = new PersoniGUI();
         desktopPane.add(pf);
        pf.show();
         
         
    }//GEN-LAST:event_Personi2ActionPerformed

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        FoodMenuUserGUI d = new FoodMenuUserGUI();
        desktopPane.add(d);
        d.show();
       
    }//GEN-LAST:event_FoodActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserModeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ankesa;
    private javax.swing.JButton Food;
    private javax.swing.JButton Personi2;
    private javax.swing.JLabel background;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
