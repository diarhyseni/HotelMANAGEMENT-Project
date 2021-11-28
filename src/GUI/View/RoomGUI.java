
package GUI.View;

import BLL.Room;
import DAL.RoomRepository;
import DAL.CrudFormException;
import GUI.Model.RoomTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.table.TableRowSorter;

public class RoomGUI extends javax.swing.JInternalFrame {

    
    RoomRepository pr = new RoomRepository();
    RoomTableModel ptm = new RoomTableModel();
    
    
    public RoomGUI() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        table.setAutoCreateRowSorter(true);
    }
    
    public void loadTable(){
        try{
            List<Room> lista = pr.findAll();
            ptm.addList(lista);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(RoomGUI.class.getName()).log(Level.SEVERE,null,ex);
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
                    Room p = ptm.getRoom(selectedIndex);
                    RooomID.setText(p.getRoomNumber().toString());
                   roomType.repaint();
                
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RooomID = new javax.swing.JTextField();
        roomType = new javax.swing.JComboBox<>();
        anulo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        shto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fshij = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        room = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RooomID.setText(" ");
        RooomID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RooomIDActionPerformed(evt);
            }
        });
        getContentPane().add(RooomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 30));

        roomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STANDARD", "SUITE", "DELUXE" }));
        roomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeActionPerformed(evt);
            }
        });
        getContentPane().add(roomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 230, 30));

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
        getContentPane().add(anulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 100, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro rezultatet:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 90, -1));

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
        getContentPane().add(shto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 730, 220));

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
        getContentPane().add(fshij, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 30));

        filterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterFieldActionPerformed(evt);
            }
        });
        filterField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterFieldKeyReleased(evt);
            }
        });
        getContentPane().add(filterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 120, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Lloji i dhomës:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Numri i dhomës:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 170, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shto dhoma të reja");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 260, -1));

        room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/room.png"))); // NOI18N
        room.setText(" ");
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
        getContentPane().add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 100, 90));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuloActionPerformed
        clear();
    }//GEN-LAST:event_anuloActionPerformed
    public void clear(){
                            table.clearSelection();
                            RooomID.setText("");
                           roomType.repaint();
                            
                                    }
    private void shtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoActionPerformed
        if (RooomID.getText() == " " || RooomID.getText().trim().equals("")){
           JOptionPane.showMessageDialog(this, "Numri i dhomes nuk bene te jete e zbrazet");
         
       } else if(roomType.getSelectedItem() == null || roomType.getSelectedItem() == " "){
        JOptionPane.showMessageDialog(this, "Nuk keni selektuar asnje lloj te dhomes");
        } else
        try{
            int row = table.getSelectedRow();
            if(row == -1){
                Room p = new Room();
                p.setRoomNumber(RooomID.getText());
                p.setRoomType((String)roomType.getSelectedItem());
                pr.create(p);
            }else{
                Room p = ptm.getRoom(row);
                p.setRoomNumber(RooomID.getText());
                p.setRoomType((String)roomType.getSelectedItem());
                pr.edit(p);
            }
            
            clear();
            loadTable();
        }catch(CrudFormException ex){
            JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }
    }//GEN-LAST:event_shtoActionPerformed

    private void fshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijActionPerformed
        int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Room p = ptm.getRoom(row);
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

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
      
    }//GEN-LAST:event_roomActionPerformed

    private void RooomIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RooomIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RooomIDActionPerformed
    private void filter(String query){
        RoomTableModel df;
           df = (RoomTableModel)table.getModel();

    TableRowSorter<RoomTableModel> tr = new TableRowSorter<RoomTableModel>(df);
    table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(query));
    }
 
    private void filterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterFieldActionPerformed

    private void filterFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterFieldKeyReleased
      String query = filterField.getText();
        filter(query);
    }//GEN-LAST:event_filterFieldKeyReleased

    private void roomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RooomID;
    private javax.swing.JButton anulo;
    private javax.swing.JLabel background;
    private javax.swing.JTextField filterField;
    private javax.swing.JButton fshij;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton room;
    private javax.swing.JComboBox<String> roomType;
    private javax.swing.JButton shto;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
