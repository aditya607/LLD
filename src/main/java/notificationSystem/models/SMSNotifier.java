package notificationSystem.models;

import notificationSystem.notifierChannel.SMSNotify;

public class SMSNotifier implements Notifier{

    SMSNotify smsNotify;

    public SMSNotifier(SMSNotify smsNotify) {
        this.smsNotify = smsNotify;
    }

    @Override
    public String notifyTheUser(String message, User user) {
        return "ans";
    }

}
