package DAL;

import BLL.FoodMenu;
import java.util.List;

public interface FoodMenuInterface {
    void create(FoodMenu fm) throws CrudFormException;
    void edit(FoodMenu fm) throws CrudFormException;
    void delete(FoodMenu fm) throws CrudFormException;
    List<FoodMenu> findAll() throws CrudFormException;
    FoodMenu findByID(Integer ID) throws CrudFormException;
}
