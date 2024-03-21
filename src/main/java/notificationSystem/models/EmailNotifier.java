package notificationSystem.models;

import notificationSystem.notifierChannel.EmailNotify;
import notificationSystem.notifierChannel.Notify;

public class EmailNotifier implements Notifier{

    Notify emailNotify;

    public EmailNotifier(Notify emailNotify) {
        this.emailNotify = emailNotify;
    }

    @Override
    public String notifyTheUser(String message, User user) {
        //compuation
        //blocking request
        ///validation
        return emailNotify.notifyByChannel(message, user);
    }
}
