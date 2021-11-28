package DAL;

import java.util.List;
import BLL.Personi;

public interface PersoniInterface {
    void create(Personi p) throws CrudFormException;
    void edit(Personi p) throws CrudFormException;
    void delete(Personi p) throws CrudFormException;
    List <Personi> findAll() throws CrudFormException;
    Personi findByID(Integer ID) throws CrudFormException;
}
