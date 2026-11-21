import Interface.INotification;
/*
THIS implements the interface for notifications
holds sms notitifications
 */


public class EmailNotification implements INotification {

    // from the interface
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Email to "  + " " + message);

    }

    @Override
    public void connect(String message) {
        System.out.println("Connected to ");

    }
}
