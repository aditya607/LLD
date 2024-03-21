package ObserverNotification.impl;

import ObserverNotification.model.Data;
import ObserverNotification.model.User;

public class EmailNotificationAlert implements NotificationAlert {

    User user;

    public EmailNotificationAlert(User user) {
        this.user = user;
    }

    @Override
    public void notifyTheUser(Data data) {

        System.out.println("notifying by email");
        System.out.println("data : " + data.getDataMessage());

    }
}
