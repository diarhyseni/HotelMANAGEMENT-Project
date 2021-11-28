package GUI.Model;

import BLL.FoodMenu;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FoodMenuTableModel extends AbstractTableModel {
    
    List <FoodMenu> list;
        String [] cols = {"FoodMenuID", "FoodName" , "Price"};
    
    public FoodMenuTableModel(){}
    
    public FoodMenuTableModel(List<FoodMenu> list){
        this.list = list;
    }
    
    public void addList(List<FoodMenu> list){
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
    
    public FoodMenu getFoodMenu(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FoodMenu fm = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return fm.getId(); 
            case 1:
                return fm.getFoodName();
            case 2:
                return fm.getPrice();
            default:
                return null;
        }
    }
    
  
    
}
