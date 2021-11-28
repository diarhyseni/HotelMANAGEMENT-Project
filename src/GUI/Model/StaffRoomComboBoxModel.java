package GUI.Model;

import BLL.StaffRoom;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class StaffRoomComboBoxModel extends AbstractListModel<StaffRoom> implements ComboBoxModel<StaffRoom> {

    private List<StaffRoom> data;
    private StaffRoom selectedItem;
    
    public StaffRoomComboBoxModel(){}
    
    public StaffRoomComboBoxModel(List<StaffRoom> data){
        this.data = data;
    }
    
    public void add(List<StaffRoom> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public StaffRoom getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (StaffRoom)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
