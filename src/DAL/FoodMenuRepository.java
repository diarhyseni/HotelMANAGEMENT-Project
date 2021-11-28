package DAL;

import BLL.FoodMenu;
import java.util.List;


public class FoodMenuRepository extends EntMngClass implements FoodMenuInterface {

    @Override
    public void create(FoodMenu fm) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(fm);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(FoodMenu fm) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(fm);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(FoodMenu fm) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(fm);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<FoodMenu> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("FoodMenu.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public FoodMenu findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet"); 
    }
    
}
