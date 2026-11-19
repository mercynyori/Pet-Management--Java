import java.time.LocalDateTime;

public class Medications extends Services {
     private int frequency;

    public Medications(String name, String description, LocalDateTime date) {
        super(name, description, date);
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Medications{" +
                "name='" + name + '\'' +
                "description = " + name + '\'' +
                "date = " + date + '\'' +
                "frequency = " + frequency + '\'' +
                '}';
    }

    // inherited methods from Services
    @Override
    String getMoreInfo() {
        return "";
    }

    @Override
    String getServiceType() {
        return "";
    }

    // its onw method
    public int getFrequency(){
        return frequency;
    }
}
