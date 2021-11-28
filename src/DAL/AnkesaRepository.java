package DAL;

import BLL.Ankesa;
import java.util.List;


public class AnkesaRepository extends EntMngClass implements AnkesaInterface {

    @Override
    public void create(Ankesa a) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Ankesa a) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Ankesa a) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Ankesa> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Ankesa.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Ankesa findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet"); 
    }
    
}
