package GUI.Model;

import BLL.StaffRoom;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StaffRoomTableModel extends AbstractTableModel {
    
    List <StaffRoom> list;
        String [] cols = {"StaffRoomID" ,"StaffRoomNumber", "StaffRoomDescription"};
    public StaffRoomTableModel(){}
    
    public StaffRoomTableModel(List<StaffRoom> list){
        this.list = list;
    }
    
    public void addList(List<StaffRoom> list){
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
    
    public StaffRoom getStaffRoom(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StaffRoom sr = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return sr.getId();
            case 1:
                return sr.getStaffRoomNumber();
            case 2:
                return sr.getStaffRoomDescription();
            default:
                return null;
        }
    }
    
    
    
}
