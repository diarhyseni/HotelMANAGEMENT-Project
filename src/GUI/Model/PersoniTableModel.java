package GUI.Model;

import BLL.Personi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PersoniTableModel extends AbstractTableModel {
    
    List <Personi> list;
        String [] cols = {"PersoniID" , "Emri", "Mbiemri", "DataLindjes","Tel","Adresa","CheckIn","CheckOut","Nr. dhomes",};
    
    public PersoniTableModel(){}
    
    public PersoniTableModel(List<Personi> list){
        this.list = list;
    }
    
    public void addList(List<Personi> list){
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
    
    public Personi getPersoni(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personi p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getEmri();
            case 2:
                return p.getMbiemri();
            case 3:
                return getDateToString(p.getDataLindjes());
            case 4:
                return p.getTel();
            case 5:
                return p.getAddress();
            case 6:
                return p.getCheckIn();
            case 7:
                return p.getCheckOut();
            case 8:
                return p.getRoomID().toString();
            default:
                return null;
        }
    }
    
    public String getDateToString(Date d){
        DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
        return da.format(d);
    }
    
}
