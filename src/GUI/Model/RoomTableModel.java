package GUI.Model;

import BLL.Room;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class RoomTableModel extends AbstractTableModel {
    
    List <Room> list;
        String [] cols = {"RoomID" ,"RoomNumber", "RoomType"};
    
    public RoomTableModel(){}
    
    public RoomTableModel(List<Room> list){
        this.list = list;
    }
    
    public void addList(List<Room> list){
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
    
    public Room getRoom(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Room r = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return r.getId();
            case 1:
                 return r.getRoomNumber();
            case 2:
                return r.getRoomType();
            default:
                return null;
        }
    }
    
   
}
