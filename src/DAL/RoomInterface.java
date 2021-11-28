package DAL;

import BLL.Room;
import java.util.List;


public interface RoomInterface {
    void create(Room r) throws CrudFormException;
    void edit(Room r) throws CrudFormException;
    void delete(Room r) throws CrudFormException;
    List<Room> findAll() throws CrudFormException;
    Room findByID(Integer ID) throws CrudFormException;
}
