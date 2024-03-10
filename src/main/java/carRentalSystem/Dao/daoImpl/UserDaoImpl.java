package carRentalSystem.Dao.daoImpl;

import carRentalSystem.Dao.UserDao;
import carRentalSystem.Models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    Map<String, User> users = new HashMap<>();


    @Override
    public String save(User user) {
        if(users.containsKey(user.getName())) {
            return "user already present";
        } else {
            users.put(user.getName(), user);
            return "user saved successfully";
        }
    }

    @Override
    public User get(String name) {
        return users.get(name);
    }

    @Override
    public void deleteUser(String name) {

    }
}
