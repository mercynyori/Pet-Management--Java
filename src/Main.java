import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // pet
        Pet pet = new Pet();
        Pet pet1 = new Pet("Mercy");
        Pet pet2 = new Pet("Jambi");
        Pet pet3 = new Pet("kini");
        Pet pet4 = new Pet("Queen");
        Pet pet5 = new Pet("Tevine");

        pet1.name = "Jambi";
        pet2.name = "Alex";
        pet3.name = "kini";
        pet4.name = "Queen";
        pet5.name = "Tevine";

        pet1.petId = String.valueOf(1);
        pet2.petId = String.valueOf(2);
        pet3.petId = String.valueOf(3);

        pet1.type = "Dog";
        pet2.type = "Cat";
        pet3.type = "Dog";
        pet4.type = "Rabbit";

        System.out.println("PetId1: " + pet1.petId);
        System.out.println("PetId2: " + pet2.petId);
        System.out.println("PetId3: " + pet3.petId);
        System.out.println("Name1: " +  pet1.name);
        System.out.println("Name2: " +  pet2.name);
        System.out.println("Name3: " +  pet3.name);
        System.out.println("Type1: " +  pet1.type);
        System.out.println("Type2: " +  pet3.type);
        System.out.println("Type3: " +  pet3.type);

        //user?

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.UserId = String.valueOf(1);
        user2.UserId = String.valueOf(2);
        user3.UserId = String.valueOf(3);

        user1.name = "Pauline";
        user2.name = "Wendy";
        user3.name = "Mazhar";

        user1.setEmail("mmwega13@gmail.com");
        user2.setEmail("wendy@gmail.com");
        user3.setEmail(("mazhar@gmail.com"));

        System.out.println("UserId1: " +  user1.UserId);
        System.out.println("UserId2: " +  user2.UserId);
        System.out.println("UserId3: " +  user3.UserId);
        System.out.println("Name1: " +  user1.name);
        System.out.println("Name2: " +  user2.name);
        System.out.println("Name3: " +  user3.name);
        System.out.println("Email1: " +  user1.getEmail());
        System.out.println("Email2: " +  user2.getEmail());
        System.out.println("Email3: " +  user3.getEmail());

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



        // appointments.rescheduleAppointment();




    }
}