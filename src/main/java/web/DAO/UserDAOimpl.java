package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDAOimpl implements UserDAO {


    @PersistenceContext
    private EntityManager entityManager;
    private String User;

    @Override
    public List getAllUsers() {
        return entityManager.createQuery(User ).getResultList();
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(int id, User updateUser) {
        entityManager.merge(updateUser);
    }

    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
