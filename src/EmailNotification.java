import Interface.INotification;
/*
THIS implements the interface for notifications
holds email  notitifications
 */


public class EmailNotification implements INotification {

    // from the interface
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Email to "  + receiver);

    }

    @Override
    public void connect(String message, String receiver) {
        System.out.println("Connected to " + receiver);

    }
}
