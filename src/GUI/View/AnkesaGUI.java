package GUI.View;

import BLL.Ankesa;
import DAL.AnkesaRepository;
import DAL.CrudFormException;
import GUI.Model.AnkesaTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AnkesaGUI extends javax.swing.JInternalFrame {

     AnkesaRepository pr = new AnkesaRepository();
    AnkesaTableModel ptm = new AnkesaTableModel();
    
    public AnkesaGUI() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
    }
    
    public void loadTable(){
        try{
            List<Ankesa> lista = pr.findAll();
            ptm.addList(lista);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(AnkesaGUI.class.getName()).log(Level.SEVERE,null,ex);
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
                    Ankesa p = ptm.getAnkesa(selectedIndex);
                    ankesap.setText(p.getAnkesa().toString());               
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ankesap = new javax.swing.JTextArea();
        Ankesa = new javax.swing.JButton();
        shto = new javax.swing.JButton();
        anulo = new javax.swing.JButton();
        fshij = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shkruaj ankesë");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 260, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Përshkrimi i ankesës:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 170, 30));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 920, 240));

        ankesap.setColumns(20);
        ankesap.setLineWrap(true);
        ankesap.setRows(5);
        jScrollPane1.setViewportView(ankesap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 370, 120));

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
        getContentPane().add(Ankesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 100, 90));

        shto.setBackground(new java.awt.Color(51, 51, 51));
        shto.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        shto.setForeground(new java.awt.Color(255, 255, 0));
        shto.setText("Shto");
        shto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shtoActionPerformed(evt);
            }
        });
        getContentPane().add(shto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 100, 30));

        anulo.setBackground(new java.awt.Color(51, 51, 51));
        anulo.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        anulo.setForeground(new java.awt.Color(255, 255, 0));
        anulo.setText("Anulo");
        anulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuloActionPerformed(evt);
            }
        });
        getContentPane().add(anulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 100, 30));

        fshij.setBackground(new java.awt.Color(51, 51, 51));
        fshij.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        fshij.setForeground(new java.awt.Color(255, 255, 0));
        fshij.setText("Fshij");
        fshij.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fshij.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fshij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshijActionPerformed(evt);
            }
        });
        getContentPane().add(fshij, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 100, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnkesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnkesaActionPerformed
        
    }//GEN-LAST:event_AnkesaActionPerformed
    public void clear(){
                            table.clearSelection();
                            ankesap.setText("");
                           

                        }
    private void shtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoActionPerformed
        
       if (ankesap.getText() == null || ankesap.getText().trim().equals("")){
           JOptionPane.showMessageDialog(this, "Ankesa nuk bene te jete e zbrazet");
       } 
       else
            try{
           
            int row = table.getSelectedRow();
            if(row == -1){
                Ankesa p = new Ankesa();
                p.setAnkesa(ankesap.getText());
                pr.create(p);
            }else{
                Ankesa p = ptm.getAnkesa(row);
                p.setAnkesa(ankesap.getText());
                pr.edit(p);
            }
            
            clear();
            loadTable();
        }catch(CrudFormException ex){
            JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }

    }//GEN-LAST:event_shtoActionPerformed

    private void anuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuloActionPerformed
        clear();
    }//GEN-LAST:event_anuloActionPerformed

    private void fshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijActionPerformed
        int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Ankesa p = ptm.getAnkesa(row);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ankesa;
    private javax.swing.JTextArea ankesap;
    private javax.swing.JButton anulo;
    private javax.swing.JLabel background;
    private javax.swing.JButton fshij;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton shto;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
