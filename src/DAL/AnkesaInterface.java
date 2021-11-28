package DAL;

import BLL.Ankesa;
import java.util.List;

public interface AnkesaInterface {
    void create(Ankesa a) throws CrudFormException;
    void edit(Ankesa a) throws CrudFormException;
    void delete(Ankesa a) throws CrudFormException;
    List<Ankesa> findAll() throws CrudFormException;
    Ankesa findByID(Integer ID) throws CrudFormException;
}
