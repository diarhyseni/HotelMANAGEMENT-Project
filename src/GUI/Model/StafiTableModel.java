package GUI.Model;

import BLL.Stafi;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StafiTableModel extends AbstractTableModel {
    
    List <Stafi> list;
        String [] cols = {"StafiID" , "Emri", "Mbiemri","Tel","LlojiPunes","Numri i dhomes",};
    
    public StafiTableModel(){}
    
    public StafiTableModel(List<Stafi> list){
        this.list = list;
    }
    
    public void addList(List<Stafi> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Stafi getStafi(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Stafi s = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return s.getId();
            case 1:
                return s.getEmri();
            case 2:
                return s.getMbiemri();
            case 3:
                return s.getTel();
            case 4:
                return s.getLlojiPunes();
            case 5:
                return s.getStaffRoomID();
            
            default:
                return null;
        }
    }
    
   
    
}
