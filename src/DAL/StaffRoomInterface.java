package DAL;

import BLL.StaffRoom;
import java.util.List;

public interface StaffRoomInterface {
    void create(StaffRoom sr) throws CrudFormException;
    void edit(StaffRoom sr) throws CrudFormException;
    void delete(StaffRoom sr) throws CrudFormException;
    List<StaffRoom> findAll() throws CrudFormException;
    StaffRoom findByID(Integer ID) throws CrudFormException;
}
