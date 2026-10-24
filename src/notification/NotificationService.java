package notification;

public class NotificationService {
    private NotificationStrategy strategy;

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notifyUser(String recipient, String message) {
        if (strategy == null) {
            throw new IllegalStateException("Notification strategy is not set.");
        }
        strategy.send(recipient, message);
    }
}