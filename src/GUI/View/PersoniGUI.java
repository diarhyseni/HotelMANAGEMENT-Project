package GUI.View;

import BLL.Personi;
import BLL.Room;
import DAL.CrudFormException;
import DAL.PersoniRepository;
import DAL.RoomRepository;
import GUI.Model.PersoniTableModel;
import GUI.Model.RoomComboBoxModel;
import GUI.Model.RoomTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;


public class PersoniGUI extends javax.swing.JInternalFrame {
                
     PersoniRepository pr = new PersoniRepository();
    PersoniTableModel ptm = new PersoniTableModel();
    RoomRepository rr = new RoomRepository();
    RoomComboBoxModel rcmb = new RoomComboBoxModel();
   // Room r = new Room();
    
    public PersoniGUI() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        loadTable1();
        loadComboBox();
        table.setAutoCreateRowSorter(true); //sortimi
    }
    
    public void loadTable(){
        try{
            List<Personi> listaa = pr.findAll();
            ptm.addList(listaa);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(PersoniGUI.class.getName()).log(Level.SEVERE,null,ex);
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
                    Personi p = ptm.getPersoni(selectedIndex);
                
                    emri.setText(p.getEmri().toString());
                    mbiemri.setText(p.getMbiemri().toString());
                   datalindjes.setDate(p.getDataLindjes());
                  tel.setText(p.getTel().toString());
                   adresa.setText(p.getAddress().toString());
                   checkin.setDate(p.getCheckIn());
                   checkout.setDate(p.getCheckOut());
                   rcmb.setSelectedItem(p.getRoomID());
                    personiCMB.repaint();
                
                }
            }
        });
        
    }
   
    
      RoomRepository rrr= new RoomRepository();
        RoomTableModel pptm = new RoomTableModel();
        
public void loadTable1(){
 
        try{
            List<Room> lista = rrr.findAll();
            pptm.addList(lista);
            table2.setModel(pptm);
            pptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(RoomGUI.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
 
  public void loadComboBox(){
        try{
            List<Room> lista = rr.findAll();
            rcmb.add(lista);
            personiCMB.setModel((ComboBoxModel)rcmb);
            personiCMB.repaint();
        }catch(CrudFormException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Personi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        filterField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        checkin = new com.toedter.calendar.JDateChooser();
        checkout = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        adresa = new javax.swing.JTextField();
        mbiemri = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        datalindjes = new com.toedter.calendar.JDateChooser();
        anulo = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        emri = new javax.swing.JTextField();
        fshij = new javax.swing.JButton();
        shto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        personiCMB = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Personi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/stafi.png"))); // NOI18N
        Personi.setText(" ");
        Personi.setBorderPainted(false);
        Personi.setContentAreaFilled(false);
        Personi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Personi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Personi.setInheritsPopupMenu(true);
        Personi.setMaximumSize(new java.awt.Dimension(100, 100));
        Personi.setMinimumSize(new java.awt.Dimension(100, 100));
        Personi.setPreferredSize(new java.awt.Dimension(100, 100));
        Personi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersoniActionPerformed(evt);
            }
        });
        getContentPane().add(Personi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 90, 80));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dhomat:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, -1, -1));

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
        getContentPane().add(filterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 120, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro rezultatet:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 90, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Emri:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Datalindjes:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tel:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Adresa:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Check in:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Check out:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Room Number:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 30));
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 30));
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 170, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mbiemri:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 30));
        getContentPane().add(adresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 30));
        getContentPane().add(mbiemri, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, 30));

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
        jScrollPane1.setViewportView(table);

        jScrollPane5.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 900, 190));
        getContentPane().add(datalindjes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, 30));

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
        getContentPane().add(anulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 100, 30));

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.setName(""); // NOI18N
        jScrollPane3.setViewportView(table2);

        jScrollPane6.setViewportView(jScrollPane3);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 650, 150));

        emri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emriActionPerformed(evt);
            }
        });
        getContentPane().add(emri, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 30));

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
        getContentPane().add(fshij, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 100, 30));

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
        getContentPane().add(shto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 100, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rezervo vend në hotel");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        personiCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        personiCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personiCMBActionPerformed(evt);
            }
        });
        getContentPane().add(personiCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 170, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setText(" ");
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoActionPerformed
        //validimi i formes
        String regex = "[0-9]+";
        
        if(emri.getText() == " " || emri.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Emri nuk bene te jete i zbrazet!");
        } else if(mbiemri.getText() == " " || mbiemri.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Mbiemri nuk bene te jete i zbrazet!");
        } else if(datalindjes.getDate() == null){
        JOptionPane.showMessageDialog(this, "Data e lindjes nuk bene te jete e zbrazet!");
        } else if(tel.getText() == " " || tel.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Tel nuk bene te jete i zbrazet!");
        } else if(adresa.getText() == " " || adresa.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Adresa nuk bene te jete e zbrazet!");
        } else if(checkin.getDate() == null){
        JOptionPane.showMessageDialog(this, "Check In nuk bene te jete i zbrazet!");
        } else if(checkout.getDate() == null){
        JOptionPane.showMessageDialog(this, "Check Out nuk bene te jete i zbrazet!");
        } else if(personiCMB.getSelectedItem() == null || personiCMB.getSelectedItem() == " "){
        JOptionPane.showMessageDialog(this, "Nuk keni selektuar asnje dhome");
        } else if(checkin.getDate().after(checkout.getDate())){
        JOptionPane.showMessageDialog(this, "Data e check out nuk eshte valide!");
        } else if(tel.getText().length() != 9){
        JOptionPane.showMessageDialog(this, "Numri i telefonit duhete te permbaje 9 karaktere!");
        } else if(!tel.getText().startsWith("0")){
        JOptionPane.showMessageDialog(this, "Formati i numrit te telefonit duhet te jete 0XXXXXXXX");
        } else if (!tel.getText().matches(regex)){
        JOptionPane.showMessageDialog(this, "Telefoni duhet te permbaje vetem numra!");
        }
        else
        try{
            int row = table.getSelectedRow();
            if(row == -1){
              Personi p = new Personi();
              
              p.setEmri(emri.getText());
              p.setMbiemri(mbiemri.getText());
              p.setDataLindjes(datalindjes.getDate());
              p.setTel(tel.getText());
              p.setAddress(adresa.getText());
              p.setCheckIn(checkin.getDate());
              p.setCheckOut(checkout.getDate());
              p.setRoomID((Room)rcmb.getSelectedItem());
                pr.create(p);
              
            }else{
                Personi p = ptm.getPersoni(row);
                
                p.setEmri(emri.getText());
                p.setMbiemri(mbiemri.getText());
                p.setDataLindjes(datalindjes.getDate());
                p.setTel(tel.getText());
                p.setAddress(adresa.getText());
                p.setCheckIn(checkin.getDate());
                p.setCheckOut(checkout.getDate());
                p.setRoomID((Room)rcmb.getSelectedItem());
                pr.edit(p);
            }
            
            clear();
            loadTable();
        }catch(CrudFormException ex){
            JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }
    }//GEN-LAST:event_shtoActionPerformed

      public void clear(){
       table.clearSelection();
       emri.setText("");
       mbiemri.setText("");
       datalindjes.setCalendar(null);
       tel.setText("");
       adresa.setText("");
       checkin.setCalendar(null);
       checkout.setCalendar(null);
       personiCMB.setSelectedIndex(-1);
       personiCMB.repaint();
      
        
    }
    private void anuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuloActionPerformed
        clear();
    }//GEN-LAST:event_anuloActionPerformed

    private void fshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijActionPerformed
       int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Personi p = ptm.getPersoni(row);
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

    private void emriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emriActionPerformed

    private void PersoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersoniActionPerformed

    private void personiCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personiCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personiCMBActionPerformed

    private void filterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterFieldActionPerformed

    private void filterFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterFieldKeyReleased
        String query = filterField.getText();
        filter(query);
    }//GEN-LAST:event_filterFieldKeyReleased
    private void filter(String query){
         PersoniTableModel df;
            df = (PersoniTableModel)table.getModel();

     TableRowSorter<PersoniTableModel> tr = new TableRowSorter<PersoniTableModel>(df);
     table.setRowSorter(tr);
     tr.setRowFilter(RowFilter.regexFilter(query));
     }

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
            java.util.logging.Logger.getLogger(PersoniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersoniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersoniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersoniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersoniGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Personi;
    private javax.swing.JTextField adresa;
    private javax.swing.JButton anulo;
    private javax.swing.JLabel background;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private com.toedter.calendar.JDateChooser datalindjes;
    private javax.swing.JTextField emri;
    private javax.swing.JTextField filterField;
    private javax.swing.JButton fshij;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField mbiemri;
    private javax.swing.JComboBox<String> personiCMB;
    private javax.swing.JButton shto;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
