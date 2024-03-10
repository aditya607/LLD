package carRentalSystem.inventory;

import carRentalSystem.Dao.UserDao;
import carRentalSystem.Models.Store;
import carRentalSystem.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRentalSystemInventory {

    private UserDao userDao;
    List<Store> stores = new ArrayList<>();

    public CarRentalSystemInventory(UserDao userDao) {
        this.userDao = userDao;
    }

    public Optional<Store> getStoreForCity(String city) {

        for(Store store: stores) {
            if(city.equalsIgnoreCase(store.getCity())) {
                return Optional.of(store);
            }
        }
        return Optional.empty();

    }

    public void addStores(Store store) {
        stores.add(store);
    }

    public void addUsers(User user) {
        userDao.save(user);
    }
}
