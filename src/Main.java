import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // pet
        Pet pet = new Pet();
        Pet pet1 = new Pet("1", "Jambi","Dog", 23.5F, 13.3, "Pauline", "Bone_dog", "Brown",false);
        Pet pet2 = new Pet("2","Alex", "Cat",32.4F,12.5,"Wendy","Keys","Black", true);
        Pet pet3 = new Pet("3","kini", "Dog", 34.7F, 12.5,"Mazhar", "beef", "white",false);
        Pet pet4 = new Pet("4","Queen","Dog", 12.5F, 14.6, "kini","Toys", "brown",false);


        //user?

        User user1 = new User("1","Pauline","Female",90876,"pauline@gmail.com");
        User user2 = new User("2", "Wendy", "Female",879097, "wendy@gmail.com");
        User user3 = new User("3", "Mazhar", "Male", 78654, "mazhar@gmail.com");
        User user4 = new User("4","kini", "Female", 908658, "kini@gmail.com" );

        user1.UserId = String.valueOf(1);
        user1.setEmail("mmwega13@gmail.com");
        System.out.println("UserId1: " +  user1.UserId);


        // Serves children
        // appointments
        Appointments appointments = new Appointments(pet1,
                "General appointment",
                "Follow up appointment",
                "Confirmed");

        System.out.println(appointments);

        System.out.println(pet1);
        System.out.println(pet1.getServices());

        Appointments appointments1 = new Appointments(
                pet2,
                "Consultation Appointment",
                "Solve limping issue",
                "Upcoming"
        );

        appointments.CancelService();
        appointments.ScheduleService();
        appointments.doctor_name ="Quinic";
        System.out.println(appointments1);

        // medication
        Medications medications = new Medications(pet1,
                "Antibiotics",
                "Treat leg infections",
                "Upcoming"
        );
        System.out.println(medications);

        Medications medications1 = new Medications(
                pet2,
                "Vitamins",
                "Add more blood due to infection",
                "Upcoming"
        );
        System.out.println(medications1);

        // vaccination
        Vaccinations vaccination = new Vaccinations(pet1,
                "Rabbies",
                "More blood vaccination",
                "Completed"
        );
        System.out.println(vaccination);
        Vaccinations vaccination1 = new Vaccinations(pet2,
                "Diester",
                "Avoid respiratory issues",
                "Upcoming"
        );
        System.out.println(vaccination1);
        pet1.addService(appointments);
        pet1.addService(medications);
        pet1.addService((vaccination));
        System.out.println(pet1.getServices());
        System.out.println(pet1.getServices());
        pet2.addService(appointments1);
        pet2.addService(medications1);
        pet2.addService(vaccination1);
        System.out.println(pet2.getServices());

        // Notification centre // polymorphism
        INotification emailnotifer = new EmailNotifications();
        INotification smsnotifer = new SMSNotifications();
        System.out.println(user4);

       //specific recipient receives the notifications
        emailnotifer.sendNotification(
                user1.getEmail(),
                "Jambi's follow up appointment tomorrow!"
        );
        smsnotifer.sendNotification(user2.getEmail(),
                "Upcoming babysitting");




        // appointments.rescheduleAppointment();




    }
}