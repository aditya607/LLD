package ObserverNotification.observer;

import ObserverNotification.impl.NotificationAlert;
import ObserverNotification.model.Data;

public interface Observer {

     void add(NotificationAlert notificationAlert);
     void delete(NotificationAlert notificationAlert);

     void notifyUser();
    public void setData(Data data);
}
