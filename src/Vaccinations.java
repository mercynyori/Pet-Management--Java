import java.time.LocalDateTime;
/*
this holds the vaccination of the pets and extends from the parent class of services
 */

public class Vaccinations extends Services {
      private String veterinary_doc;

    //constructor
    public Vaccinations(String name, String description, LocalDateTime date) {
        super(name, description, date);
        this.veterinary_doc = veterinary_doc;
    }

    //to change the output to string
    @Override
    public String toString() {
        return "Vaccinations{" +
                "name='" + name + '\'' +
                "description = " + description + '\'' +
                "date = " + date + '\'' +
                "veterinary_doc = " + veterinary_doc + '\'' +
                '}';
    }

    //methods implemented from parent
    @Override
    String getMoreInfo() {
        return "";
    }

    @Override
    String getServiceType() {
        return "";
    }

    //unique method
    public String getVeterinary_doc(){
        return veterinary_doc;
    }

}