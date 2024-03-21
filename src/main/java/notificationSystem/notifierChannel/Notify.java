package notificationSystem.notifierChannel;

import notificationSystem.models.User;

public interface Notify {

    String notifyByChannel(String message, User user);
}
