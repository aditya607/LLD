package notificationSystem.models;

public class Notification {

    private String userId;
    private String message;
    private NotificationChannel channel;

    public Notification(String userId, String message, NotificationChannel channel) {
        this.userId = userId;
        this.message = message;
        this.channel = channel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }
}
