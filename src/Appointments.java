import java.time.LocalDateTime;

public class Appointments extends Services{

    String venue;


// contructors
    public Appointments(String name, String description, LocalDateTime date) {
        super(name, description, date);
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "name ='" + name + '\'' +
                " description = " + description + '\'' +
                " date = " + date + '\'' +
                "venue = " + venue + '\'' +
                '}';
    }

    // inherited from services
    @Override
    String getMoreInfo() {
        return "";
    }

    @Override
    String getServiceType() {
        return "";
    }

    // its own method
    public String getvenue(){
        return venue;
    }
}




