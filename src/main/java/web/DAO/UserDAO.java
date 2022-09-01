package web.DAO;

import web.model.User;
import java.util.List;


public interface UserDAO {
    List<User> getAllUsers();
    void saveUser(User user);
    User show(int id);
    void update(int id, User user);
    void delete(int id);
}
