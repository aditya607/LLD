package ObserverNotification;

import ObserverNotification.impl.EmailNotificationAlert;
import ObserverNotification.impl.SMSNotificationAlert;
import ObserverNotification.model.Data;
import ObserverNotification.model.User;
import ObserverNotification.model.WeatherData;
import ObserverNotification.observer.Observer;
import ObserverNotification.observer.ObserverImpl;

public class NotificationSystem {

    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();
        Observer observer = new ObserverImpl();

        notificationSystem.initialise(observer);
        observer.notifyUser();
    }

    private void initialise(Observer observer) {
        User user = new User("john", "john_mobile", "john_email");
        User user1 = new User("john1", "john1_mobile", "john1_email");
        EmailNotificationAlert emailNotificationAlert = new EmailNotificationAlert(user);
        SMSNotificationAlert smsNotificationAlert = new SMSNotificationAlert(user1);
        observer.add(emailNotificationAlert);
        observer.add(smsNotificationAlert);

        Data data = new WeatherData(37.3);
        observer.setData(data);


    }
}
