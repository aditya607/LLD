package carRentalSystem.Dao;

import carRentalSystem.Models.User;

public interface UserDao {

    public String save(User user);
    public User get(String name);

    public void deleteUser(String name);
}
