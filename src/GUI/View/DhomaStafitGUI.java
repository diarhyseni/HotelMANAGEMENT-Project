package GUI.View;

import BLL.StaffRoom;
import DAL.CrudFormException;
import DAL.StaffRoomRepository;
import GUI.Model.StaffRoomTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class DhomaStafitGUI extends javax.swing.JInternalFrame {

    StaffRoomRepository pr = new StaffRoomRepository();
    StaffRoomTableModel ptm = new StaffRoomTableModel();
    
    
    public DhomaStafitGUI() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
    }
    
    public void loadTable(){
        try{
            List<StaffRoom> lista = pr.findAll();
            ptm.addList(lista);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(DhomaStafitGUI.class.getName()).log(Level.SEVERE,null,ex);
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
                    StaffRoom p = ptm.getStaffRoom(selectedIndex);
                    staffRoomID.setText(p.getStaffRoomNumber().toString());
                   StafRoomDescription.setText(p.getStaffRoomDescription().toString());
                
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staffRoomID = new javax.swing.JTextField();
        StafRoomDescription = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stafRoom = new javax.swing.JButton();
        fshij = new javax.swing.JButton();
        shto = new javax.swing.JButton();
        anulo = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffRoomID.setText(" ");
        staffRoomID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRoomIDActionPerformed(evt);
            }
        });
        getContentPane().add(staffRoomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 240, 30));

        StafRoomDescription.setText(" ");
        getContentPane().add(StafRoomDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 240, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 730, 220));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Përshkrimi (optional):");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Numri i dhomës:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shto dhoma të reja të stafit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 360, -1));

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
        getContentPane().add(stafRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 100, 90));

        fshij.setBackground(new java.awt.Color(204, 204, 255));
        fshij.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        fshij.setForeground(new java.awt.Color(153, 0, 153));
        fshij.setText("Fshij");
        fshij.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        fshij.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fshij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshijActionPerformed(evt);
            }
        });
        getContentPane().add(fshij, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 100, 30));

        shto.setBackground(new java.awt.Color(204, 204, 255));
        shto.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        shto.setForeground(new java.awt.Color(153, 0, 153));
        shto.setText("Shto");
        shto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        shto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shtoActionPerformed(evt);
            }
        });
        getContentPane().add(shto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 100, 30));

        anulo.setBackground(new java.awt.Color(204, 204, 255));
        anulo.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        anulo.setForeground(new java.awt.Color(153, 0, 153));
        anulo.setText("Anulo");
        anulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        anulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuloActionPerformed(evt);
            }
        });
        getContentPane().add(anulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 100, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
         public void clear(){
                            table.clearSelection();
                            staffRoomID.setText("");
                           StafRoomDescription.setText("");
                            
                                    }
    private void staffRoomIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRoomIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffRoomIDActionPerformed

    private void stafRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafRoomActionPerformed
        
    }//GEN-LAST:event_stafRoomActionPerformed

    private void fshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijActionPerformed
        int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                StaffRoom p = ptm.getStaffRoom(row);
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

    private void shtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoActionPerformed
        if(staffRoomID.getText() == " " || staffRoomID.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Numri i dhomes nuk bene te jete i zbrazet!");
        } 
        else
        try{
            int row = table.getSelectedRow();
            if(row == -1){
                StaffRoom p = new StaffRoom();
                p.setStaffRoomNumber(staffRoomID.getText());
                p.setStaffRoomDescription(StafRoomDescription.getText());
                pr.create(p);
            }else{
                StaffRoom p = ptm.getStaffRoom(row);
                p.setStaffRoomNumber(staffRoomID.getText());
                p.setStaffRoomDescription(StafRoomDescription.getText());
                pr.edit(p);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(CrudFormException ex){
            JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }
    }//GEN-LAST:event_shtoActionPerformed

    private void anuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuloActionPerformed
        clear();
    }//GEN-LAST:event_anuloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StafRoomDescription;
    private javax.swing.JButton anulo;
    private javax.swing.JLabel background;
    private javax.swing.JButton fshij;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton shto;
    private javax.swing.JButton stafRoom;
    private javax.swing.JTextField staffRoomID;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
