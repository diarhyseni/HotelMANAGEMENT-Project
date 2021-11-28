package GUI.Model;

import BLL.Room;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class RoomComboBoxModel extends AbstractListModel<Room> implements ComboBoxModel<Room> {

    private List<Room> data;
    private Room selectedItem;
    
    public RoomComboBoxModel(){}
    
    public RoomComboBoxModel(List<Room> data){
        this.data = data;
    }
    
    public void add(List<Room> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Room getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Room)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
