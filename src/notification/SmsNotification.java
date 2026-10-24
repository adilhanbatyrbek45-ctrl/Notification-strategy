package notification;

public class SmsNotification implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
