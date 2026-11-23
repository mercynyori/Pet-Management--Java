import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // user
        User Mackenzie = new User("Mackenzie", "Female", +23456778, "mackenzie@gmail.com");

        // pet 1 add its stuff
       Pet Hunter = new Pet("Hunter", "Dog", 13.8F, "German Sherpherd", 12);
       Hunter.getAppointments().add(new Appointments("ChekUp","Teeth and Ears Checkup", LocalDate.now().atStartOfDay()));
       Hunter.getMedications().add(new Medications("Vitamins","To boost blood", LocalDateTime.now()));
       Hunter.getVacccinations().add(new Vaccinations("Rabbies","To avoid rabbies",LocalDateTime.now()));
       Hunter.getFoods().add(new Food("Dog bites",12," in 2 weeks","Peanuts"));
       Mackenzie.addpet(Hunter);

       // pet2 and its stuff
        Pet Orange = new Pet("Orange", "Cat",10.7F, "Siamese",3);
        Orange.getAppointments().add(new Appointments("Follow Up", "She had an injury need follow ups",LocalDate.now().atStartOfDay()));
        Orange.getMedications().add(new Medications("Flu treatment","To heal the flu that was there",LocalDateTime.now()));
        Orange.getVacccinations().add(new Vaccinations("Rabbies","Prevent rabbies",LocalDateTime.now()));
        Orange.getFoods().add(new Food("Cat bites", 13,"in 4 weeks","Cinnamon"));
        Mackenzie.addpet(Orange);

        //System.out.println(Mackenzie.getPets());
       // System.out.println(Hunter.getAppointments());
       // System.out.println(Orange.getAppointments());
       // System.out.println(Hunter.getMedications());
       // System.out.println(Orange.getMedications());
        //System.out.println(Orange.getVacccinations());
        //System.out.println(Hunter.getVacccinations());
        //System.out.println(Hunter.getFoods());
        //System.out.println(Orange.getFoods());



    }
}