package GUI.View;

import BLL.StaffRoom;
import BLL.Stafi;
import DAL.CrudFormException;
import DAL.StaffRoomRepository;
import DAL.StafiRepository;
import GUI.Model.StafiTableModel;
import GUI.Model.StaffRoomComboBoxModel;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class StafiGUI extends javax.swing.JInternalFrame {
    StafiRepository vr = new StafiRepository();
    StaffRoomRepository ppr = new StaffRoomRepository();
    StafiTableModel vtm = new StafiTableModel();
    StaffRoomComboBoxModel pcmb = new StaffRoomComboBoxModel();
    
    
    public StafiGUI() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        loadComboBox();
    }
    
    public void loadTable(){
        try{
            List<Stafi> lista = vr.findAll();
            vtm.addList(lista);
            table.setModel(vtm);
            vtm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(StafiGUI.class.getName()).log(Level.SEVERE,null,ex);
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
                    Stafi v = vtm.getStafi(selectedIndex);
                   // idField.setText(v.getId().toString());
                    emri.setText(v.getEmri());
                    mbiemri.setText(v.getMbiemri());
                    tel.setText(v.getTel()+ "");
                    llojiPunes.setText(v.getLlojiPunes());
                    pcmb.setSelectedItem(v.getStaffRoomID());
                    stafiCombo.repaint();
                }
            }
        });
    }
    
    public void loadComboBox(){
        try{
            List<StaffRoom> lista = ppr.findAll();
            pcmb.add(lista);
            stafiCombo.setModel((ComboBoxModel)pcmb);
            stafiCombo.repaint();
        }catch(CrudFormException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gjeneroRaport = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        shto = new javax.swing.JButton();
        anulo = new javax.swing.JButton();
        stafi2 = new javax.swing.JButton();
        fshij = new javax.swing.JButton();
        emri = new javax.swing.JTextField();
        mbiemri = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stafiCombo = new javax.swing.JComboBox<>();
        llojiPunes = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gjeneroRaport.setBackground(new java.awt.Color(51, 51, 51));
        gjeneroRaport.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        gjeneroRaport.setForeground(new java.awt.Color(255, 0, 0));
        gjeneroRaport.setText("Gjenero Raport për Stafin");
        gjeneroRaport.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
        gjeneroRaport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gjeneroRaportActionPerformed(evt);
            }
        });
        getContentPane().add(gjeneroRaport, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 320, 210, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shto stafin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

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
        getContentPane().add(shto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 100, 30));

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
        getContentPane().add(anulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 100, 30));

        stafi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/View/stafi1.png"))); // NOI18N
        stafi2.setText(" ");
        stafi2.setBorderPainted(false);
        stafi2.setContentAreaFilled(false);
        stafi2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        stafi2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stafi2.setInheritsPopupMenu(true);
        stafi2.setMaximumSize(new java.awt.Dimension(100, 100));
        stafi2.setMinimumSize(new java.awt.Dimension(100, 100));
        stafi2.setPreferredSize(new java.awt.Dimension(100, 100));
        stafi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stafi2ActionPerformed(evt);
            }
        });
        getContentPane().add(stafi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 100, 90));

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
        getContentPane().add(fshij, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 100, 30));
        getContentPane().add(emri, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 30));
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

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 610, 310));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mbiemri:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Emri:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tel:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Number:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lloji i punës:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 30));

        stafiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(stafiCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 30));
        getContentPane().add(llojiPunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, 30));
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, 30));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 0));
        background.setText(" ");
        background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoActionPerformed
        String regex = "[0-9]+";
        
        if(emri.getText() == " " || emri.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Emri nuk bene te jete i zbrazet!");
        } else if(mbiemri.getText() == " " || mbiemri.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Mbiemri nuk bene te jete i zbrazet!");
        } else if(tel.getText() == " " || tel.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Tel nuk bene te jete i zbrazet!");
        } else if(stafiCombo.getSelectedItem() == null || stafiCombo.getSelectedItem() == " "){
        JOptionPane.showMessageDialog(this, "Nuk keni selektuar asnje dhome");
        } else if(llojiPunes.getText() == " " || llojiPunes.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "LLoji i punes nuk bene te jete i zbrazet!");
        } else if(tel.getText().length() != 8){
        JOptionPane.showMessageDialog(this, "Numri i telefonit duhet te permbaje vetem 8 karaktere");
        } else if(tel.getText().startsWith("0")){
        JOptionPane.showMessageDialog(this, "Ju lutem numrin e telefonit e shkruani pa 0 ne fillim, p.sh. 44123123");
        } else if (!tel.getText().matches(regex)){
        JOptionPane.showMessageDialog(this, "Telefoni duhet te permbaje vetem numra!");
        } 
        else
        try{
            int row = table.getSelectedRow();
            if(row == -1){
                Stafi p = new Stafi();
                
                p.setEmri(emri.getText());
                p.setMbiemri(mbiemri.getText());
                p.setTel(Integer.parseInt(tel.getText()));
                p.setLlojiPunes(llojiPunes.getText());
                p.setStaffRoomID((StaffRoom)pcmb.getSelectedItem());
                vr.create(p);
            }else{
                Stafi p = vtm.getStafi(row);
               
                p.setEmri(emri.getText());
                p.setMbiemri(mbiemri.getText());
                p.setTel(Integer.parseInt(tel.getText()));
                p.setLlojiPunes(llojiPunes.getText());
                p.setStaffRoomID((StaffRoom)pcmb.getSelectedItem());
                vr.edit(p);
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

    
     public void clear(){
        table.clearSelection();
        emri.setText("");
        mbiemri.setText("");
        tel.setText("");
        llojiPunes.setText("");
        pcmb.setSelectedItem(null);
        stafiCombo.repaint();
    }

    private void fshijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijActionPerformed
        int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Stafi p = vtm.getStafi(row);
                try{
                    vr.delete(p);
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

    private void stafi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafi2ActionPerformed
       
    }//GEN-LAST:event_stafi2ActionPerformed

    private void gjeneroRaportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gjeneroRaportActionPerformed
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=CRUDHO8","diarhyseni31","diarhyseni31");
            
            JasperDesign jd  = JRXmlLoader.load("C:\\Users\\hp\\Documents\\HotelMANAGEMENTGroupProject\\src\\Report\\StafiRaport.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint  jp = JasperFillManager.fillReport(jr, new HashMap(),con);
            JasperViewer.viewReport(jp);
            File fajll=new File("C:\\Users\\hp\\Desktop\\Lab Course\\Raportet e Gjeneruara\\raporto.pdf");
            File fajlli;
            for(int i = 0; fajll.exists();i++){
                fajlli = new File("C:\\Users\\hp\\Desktop\\Lab Course\\Raportet e Gjeneruara\\raporti"+i+".pdf");
                fajll.renameTo(fajlli);
            }
            JasperExportManager.exportReportToPdfFile(
            jp, fajll.getAbsolutePath());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    }//GEN-LAST:event_gjeneroRaportActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StafiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anulo;
    private javax.swing.JLabel background;
    private javax.swing.JTextField emri;
    private javax.swing.JButton fshij;
    private javax.swing.JButton gjeneroRaport;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField llojiPunes;
    private javax.swing.JTextField mbiemri;
    private javax.swing.JButton shto;
    private javax.swing.JButton stafi2;
    private javax.swing.JComboBox<String> stafiCombo;
    private javax.swing.JTable table;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}