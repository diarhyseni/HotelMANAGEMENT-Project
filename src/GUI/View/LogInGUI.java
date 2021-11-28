package GUI.View;

import BLL.Perdoruesi;
import DAL.CrudFormException;
import DAL.PerdoruesiRepository;
import java.awt.Color;
import javax.swing.JOptionPane;


public class LogInGUI extends javax.swing.JFrame {

    
    public LogInGUI() {
        getContentPane().setBackground(Color.WHITE);
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        shto1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Log In as Admin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, -1));

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 0));
        login.setText("LOG IN");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 100, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 170, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 170, 30));

        shto1.setBackground(new java.awt.Color(51, 51, 51));
        shto1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        shto1.setForeground(new java.awt.Color(255, 255, 0));
        shto1.setText("SIGN UP");
        shto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shto1ActionPerformed(evt);
            }
        });
        getContentPane().add(shto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 100, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         if(username.getText() == null || username.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Nuk keni shtypur username!");
        }
        else if(password.getText() == null || password.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Nuk keni shtypur password!");
        }
        else      
        try {
            PerdoruesiRepository pr = new PerdoruesiRepository();
            Perdoruesi p = pr.loginByUsernameAndPassword(username.getText(), new String(password.getPassword()));
            if (p != null) {
                //if(username.getText().equals("Admin")){ 
                    if(p.getRoliID().getId() == 1){
                   AdminModeGUI a = new AdminModeGUI();
                   a.setVisible(true); 
                   this.setVisible(false);
                } else {
                JOptionPane.showMessageDialog(this, "Nuk keni te drejte te qaseni ne Admin Mode nese jeni user!");
            }
            }
        } catch (CrudFormException ex) {
            JOptionPane.showMessageDialog(this, "Username apo password jane shtypur gabim! ");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void shto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shto1ActionPerformed
                   AddUsersGUI a = new AddUsersGUI();
                   a.setVisible(true); 
                   
    }//GEN-LAST:event_shto1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton shto1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
