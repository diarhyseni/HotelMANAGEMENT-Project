package DAL;


import java.util.List;
import BLL.Personi;

public class PersoniRepository extends EntMngClass implements PersoniInterface {

    @Override
    public void create(Personi p) throws CrudFormException {
       try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Personi p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Personi p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Personi> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Personi.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Personi findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet"); 
    }
    
}
