package system;

import Interface.INotification;
/*
SMS notification are done here
 */
public class SMSNotifications  implements INotification {



    // from the interface
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("SMS sent to " + receiver + " : "+ "!");

    }

    @Override
    public void connect(String message, String receiver) {
        System.out.println("Connected to the " + receiver);

    }
}