public class EmailNotifications extends NotificationService {

    @Override
    void connect() {

    }

    @Override
    public void send(String emailAddress, String message) {
        System.out.println("[EMAIL to " + emailAddress + "] " + message);
    }
}
