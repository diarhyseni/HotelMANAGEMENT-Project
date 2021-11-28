package DAL;

import BLL.Stafi;
import java.util.List;

public interface StafiInterface {
    void create(Stafi s) throws CrudFormException;
    void edit(Stafi s) throws CrudFormException;
    void delete(Stafi s) throws CrudFormException;
    List<Stafi> findAll() throws CrudFormException;
    Stafi findByID(Integer ID) throws CrudFormException;
}
