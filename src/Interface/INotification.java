package Interface;
/*
an interface that says what is MUST for all notifications
its an interface for notications SMS, EMAIL....
then the one that implements this methds explain how the methods should work
 */

public interface INotification {
    void sendNotification (String receiver, String message);
    void connect(String message, String receiver);

}
