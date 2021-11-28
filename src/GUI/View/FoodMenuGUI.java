package GUI.View;

import BLL.FoodMenu;
import DAL.CrudFormException;
import DAL.FoodMenuRepository;
import GUI.Model.FoodMenuTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class FoodMenuGUI extends javax.swing.JInternalFrame {

    FoodMenuRepository pr = new FoodMenuRepository();
    FoodMenuTableModel ptm = new FoodMenuTableModel();
    
    
    public FoodMenuGUI() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
    }
    
    public void loadTable(){
        try{
            List<FoodMenu> lista = pr.findAll();
            ptm.addList(lista);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(FoodMenuGUI.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    FoodMenu p = ptm.getFoodMenu(selectedIndex);
                    emriUshqimit.setText(p.getFoodName().toString());
                   cmimi.setText(p.getPrice().toString());
                   
                
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emriUshqimit = new javax.swing.JTextField();
        cmimi = new javax.swing.JTextField();
        shto = new javax.swing.JButton();
        anulo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fshij = new javax.swing.JButton();
        Food = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emriUshqimit.setText(" ");
        getContentPane().add(emriUshqimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 240, 30));

        cmimi.setText(" ");
        cmimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmimiActionPerformed(evt);
            }
        });
        getContentPane().add(cmimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 240, 30));

        shto.setBackground(new java.awt.Color(204, 204, 255));
        shto.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        shto.setForeground(new java.awt.Color(204, 0, 0));
        shto.setText("Shto");
        shto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));
        shto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shtoActionPerformed(evt);
            }
        });
        getContentPane().add(shto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 100, 30));

        anulo.setBackground(new java.awt.Color(204, 204, 255));
        anulo.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        anulo.setForeground(new java.awt.Color(204, 0, 0));
        anulo.setText("Anulo");
        anulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));
        anulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuloActionPerformed(evt);
            }
        });
        getContentPane().add(anulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table);

        jScrollPane3.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 750, 210));

        fshij.setBackground(new java.awt.Color(204, 204, 255));
        fshij.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        fshij.setForeground(new java.awt.Color(204, 0, 0));
        fshij.setText("Fshij");
        fshij.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));
        fshij.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fshij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshijActionPerformed(evt);
            }
        });
        getContentPane().add(fshij, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 100, 30));

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
        getContentPane().add(Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 100, 90));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cmimi:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Emri i ushqimit:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shto ushqime të reja në menu");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 320, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmimiActionPerformed

    private void shtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoActionPerformed
           
//        cmimi.addKeyListener(new KeyAdapter() {
//    public void keyTyped(KeyEvent e) {
//      char c = e.getKeyChar();
//      if (!((c >= '0') && (c <= '9') ||
//         (c == KeyEvent.VK_BACK_SPACE) ||
//         (c == KeyEvent.VK_DELETE))) {
//        getToolkit().beep();
//        e.consume();
//      }
//    }
//  });   
       
       if (emriUshqimit.getText().trim().isEmpty() || emriUshqimit.getText() == " "){
            JOptionPane.showMessageDialog(this, "Nuk keni shtypur emer te ushqimit");

        }else  if (cmimi.getText().trim().isEmpty() || cmimi.getText() == " "){
            JOptionPane.showMessageDialog(this, "Nuk keni shtypur cmim te ushqimit!");

        }  
        else  if (!cmimi.getText().endsWith("$")){
            JOptionPane.showMessageDialog(this, "Mos harroni te shtypni shenjen e dollarit ne fund!");

        }

        else
        try{

            int row = table.getSelectedRow();
            if(row == -1){
                FoodMenu p = new FoodMenu();
                p.setFoodName(emriUshqimit.getText());
                p.setPrice(cmimi.getText());
                pr.create(p);
            }else{
                FoodMenu p = ptm.getFoodMenu(row);
                p.setFoodName(emriUshqimit.getText());
                p.setPrice(cmimi.getText());
                pr.edit(p);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(CrudFormException ex){
           // JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }

    }//GEN-LAST:event_shtoActionPerformed

    private void anuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuloActionPerformed
        clear();
    }//GEN-LAST:event_anuloActionPerformed
    
                        public void clear(){
                            table.clearSelection();
                            emriUshqimit.setText("");
                           cmimi.setText("");
                            
                                    }
    private void fshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijActionPerformed
        int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                FoodMenu p = ptm.getFoodMenu(row);
                try{
                    pr.delete(p);
                }catch(CrudFormException ex){
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
                clear();
                loadTable();
            }else{
                clear();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_fshijActionPerformed

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        
    }//GEN-LAST:event_FoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Food;
    private javax.swing.JButton anulo;
    private javax.swing.JLabel background;
    private javax.swing.JTextField cmimi;
    private javax.swing.JTextField emriUshqimit;
    private javax.swing.JButton fshij;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton shto;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
