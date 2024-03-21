package ObserverNotification.observer;

import ObserverNotification.impl.NotificationAlert;
import ObserverNotification.model.Data;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements Observer{

    List<NotificationAlert> notifications = new ArrayList<>();
    Data data;
    @Override
    public void add(NotificationAlert notificationAlert) {
        notifications.add(notificationAlert);
    }

    @Override
    public void delete(NotificationAlert notificationAlert) {
        if(notifications.contains(notificationAlert)) {
            notifications.remove(notificationAlert);
        } else {
            System.out.println("no notification exist");
        }
    }

    @Override
    public void notifyUser() {
        notifications.forEach(notification -> notification.notifyTheUser(data));
    }

    @Override
    public void setData(Data data) {
        this.data = data;
    }
}
