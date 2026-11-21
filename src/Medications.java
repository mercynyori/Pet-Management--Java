import java.time.LocalDateTime;
/*
This holds the medications of the pets
extends  from the parent service
 */

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
                "description = " + description + '\'' +
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

    // its own method
    public int getFrequency(){

        return frequency;
    }
}
