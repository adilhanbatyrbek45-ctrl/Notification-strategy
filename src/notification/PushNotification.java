package notification;

public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending PUSH notification to " + recipient + ": " + message);
    }
}
