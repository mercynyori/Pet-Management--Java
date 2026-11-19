import java.time.LocalDateTime;

/** this is an abstract class it cannot be instantiated
 * ITS the parent of vaccination, medication, appointments
 * it will carry the methods that they will all share some that
 * are a must(abstarct)
 * also it will hold the reminder message
 */

public abstract class Services {
    protected String name;  //name like check, vitamins, rabbies
    protected  String description;  // extra info about the service
    protected LocalDateTime date;  // date of service


    // constructors
    public Services(String name, String description,LocalDateTime date) {
        this.name = name;
        this.description = description;
        this.date = date;

    }

    // getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }


// methods
    // MUST across vaccination, medication and appointment  classes
    abstract String getMoreInfo();
    abstract String getServiceType();


    // reminder message to the user
    public String  getReminder(){
        return "Reminder: " + getServiceType() + "on " + date + "- " + description;
    }

}
