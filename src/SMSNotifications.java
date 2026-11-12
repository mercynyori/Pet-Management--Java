public class SMSNotifications extends NotificationService implements INotification{
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("SMS Notifications: " + message);
    }

    @Override
    void connect() {
        System.out.println("SMS NOTIFICATION CONNECTED!!");

    }
}
