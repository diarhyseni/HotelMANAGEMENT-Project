package DAL;

import BLL.StaffRoom;
import java.util.List;

public class StaffRoomRepository extends EntMngClass implements StaffRoomInterface {

    @Override
    public void create(StaffRoom sr) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(sr);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(StaffRoom sr) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(sr);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(StaffRoom sr) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(sr);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<StaffRoom> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("StaffRoom.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public StaffRoom findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet"); 
    }
    
}
