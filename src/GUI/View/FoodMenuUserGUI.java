package GUI.View;

import BLL.FoodMenu;
import DAL.CrudFormException;
import DAL.FoodMenuRepository;
import GUI.Model.FoodMenuTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FoodMenuUserGUI extends javax.swing.JInternalFrame {

     FoodMenuRepository pr = new FoodMenuRepository();
    FoodMenuTableModel ptm = new FoodMenuTableModel();
    
    
    public FoodMenuUserGUI() {
        initComponents();
        loadTable();
    }
    
    public void loadTable(){
        try{
            List<FoodMenu> lista = pr.findAll();
            ptm.addList(lista);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(FoodMenuUserGUI.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Food = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jScrollPane1.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 1040, 310));

        Food.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/food2.png"))); // NOI18N
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
        getContentPane().add(Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 100, 90));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shiko ushqimet në menu");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 320, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        
    }//GEN-LAST:event_FoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Food;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
