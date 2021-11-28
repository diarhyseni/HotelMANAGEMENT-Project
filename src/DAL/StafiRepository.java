package DAL;

import BLL.Stafi;
import java.util.List;

public class StafiRepository extends EntMngClass implements StafiInterface {

    @Override
    public void create(Stafi s) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Stafi s) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Stafi s) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Stafi> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Stafi.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Stafi findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet"); 
    }
    
}
