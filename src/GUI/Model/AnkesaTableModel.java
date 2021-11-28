package GUI.Model;


import BLL.Ankesa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AnkesaTableModel extends AbstractTableModel {
    
    List <Ankesa> list;
        String [] cols = {"AnkesaID", "Ankesa"};
    
    public AnkesaTableModel(){}
    
    public AnkesaTableModel(List<Ankesa> list){
        this.list = list;
    }
    
    public void addList(List<Ankesa> list){
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
    
    public Ankesa getAnkesa(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ankesa a = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return a.getId();
            case 1:
                return a.getAnkesa();
            default:
                return null;
        }
    }
    
   
}
