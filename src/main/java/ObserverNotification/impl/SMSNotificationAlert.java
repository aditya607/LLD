package ObserverNotification.impl;

import ObserverNotification.model.Data;
import ObserverNotification.model.User;

public class SMSNotificationAlert implements NotificationAlert {

    User user;

    public SMSNotificationAlert(User user) {
        this.user = user;
    }

    @Override
    public void notifyTheUser(Data data) {

        System.out.println("notifying by SMS");
        System.out.println("data : " + data.getDataMessage());

    }
}
