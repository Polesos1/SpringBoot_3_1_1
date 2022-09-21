package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.model.User;
import java.util.List;


@Service
@Transactional
public class UserServiceimpl implements UserService{
    private final UserDaoImpl userDAO;

    public UserServiceimpl(UserDaoImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User show(int id) {
        return userDAO.show(id);
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void update(int id, User user) {
        userDAO.update(id, user);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
