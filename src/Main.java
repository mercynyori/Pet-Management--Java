import Interface.INotification;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // user
        User Mackenzie = new User("Mackenzie", "Female", +23456778, "mackenzie@gmail.com");

        // pet 1 add its stuff
       Pet Hunter = new Pet("Hunter", "Dog", 13.8F, "German Sherpherd", 12);
       Hunter.getAppointments().add(new Appointments("ChekUp","Teeth and Ears Checkup", LocalDate.now().atStartOfDay()));
       Mackenzie.addpet(Hunter);

       // pet2 and its stuff
        Pet Orange = new Pet("Orange", "Cat",10.7F, "Siamese",3);
        Orange.getAppointments().add(new Appointments("Follow Up", "She had an injury need follow ups",LocalDate.now().atStartOfDay()));
        Mackenzie.addpet(Orange);
        //System.out.println(Mackenzie.getPets());
       // System.out.println(Hunter.getAppointments());
        System.out.println(Orange.getAppointments());









        ;


        // Serves children
        // appointments
       // Appointments appointments = new Appointments(pet1,
             //   "General appointment",
             //   "Follow up appointment",
                //"Confirmed");

       // System.out.println(appointments);

        //System.out.println(pet1);
       // System.out.println(pet1.getServices());

       // Appointments appointments1 = new Appointments(
              //  pet2,
              //  "Consultation Appointment",
              //  "Solve limping issue",
              //  "Upcoming"
       // );

       // appointments.CancelService();
      //  appointments.ScheduleService();
     //   appointments.doctor_name = "Quinic";
    //    System.out.println(appointments1);

        // medication
       // Medications medications = new Medications(pet1,
        //"Antibiotics",
           //     "Treat leg infections",
           //     "Upcoming"
      //);
       // System.out.println(medications);

      //  Medications medications1 = new Medications(
         //       pet2,
          //      "Vitamins",
          //      "Add more blood due to infection",
          //      "Upcoming"
       // );
      //  System.out.println(medications1);

        // vaccination
      //  Vaccinations vaccination = new Vaccinations(pet1,
                //"Rabbies",
               // "More blood vaccination",
               // "Completed"
       // );
       // System.out.println(vaccination);
       // Vaccinations vaccination1 = new Vaccinations(pet2,
         //       "Diester",
         //       "Avoid respiratory issues",
         //       "Upcoming"
     //   );
     //   System.out.println(vaccination1);
     //   pet1.addService(appointments);
     //   pet1.addService(medications);
     //   pet1.addService((vaccination));
      //  System.out.println(pet1.getServices());
     //   System.out.println(pet1.getServices());
      //  pet2.addService(appointments1);
      //  pet2.addService(medications1);
      //  pet2.addService(vaccination1);
     //   System.out.println(pet2.getServices());

        // Notification centre // polymorphism
     //   INotification emailnotifer = new EmailNotifications();
      //  INotification smsnotifer = new SMSNotifications();
      //  System.out.println(user4);

        //specific recipient receives the notifications
     //   emailnotifer.sendNotification(
     //           user1.getEmail(),
      //          "Jambi's follow up appointment tomorrow!"
      //  );
      //  smsnotifer.sendNotification(user2.getEmail(),
      //          "Upcoming babysitting");


        // appointments.rescheduleAppointment();


    }
}