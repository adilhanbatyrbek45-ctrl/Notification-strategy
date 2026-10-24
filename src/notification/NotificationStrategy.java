package notification;

public interface NotificationStrategy {
    void send(String recipient, String message);
}