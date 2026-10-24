package notification;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser("batyrbek.adok@example.com", "Your order has been shipped!");

        service.setStrategy(new SmsNotification());
        service.notifyUser("+77085855878", "Your verification code is 6767.");

        service.setStrategy(new PushNotification());
        service.notifyUser("Adok_007", "You received a new message.");
    }
}
