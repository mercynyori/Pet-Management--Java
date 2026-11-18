public abstract class NotificationService {

    abstract void connect();

     void alerts(String recipient, String message ){
         System.out.println("Upcoming event: " + message);
     }

    public abstract void send(String emailAddress, String message);
}
