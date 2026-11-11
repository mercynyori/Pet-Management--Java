public class Appointments extends Services {
    String doctor_name;
    int appointmentId;

    public Appointments(Pet pet, String name, String description, String status) {
        super(pet, name, description, status);
    }

    public Appointments() {
        super();
    }

    // to avoid returning reference
    @Override
    public String toString() {
        return "Appointments{" +
                " pet = " + pet +
                ", name = " + name +
                ", description = " +description +
                ", status = "+status +
                '}';
    }

    // unique method for appointments
    //public void rescheduleAppointment( LocalDateTime newDate){
      //  serviceDate = newDate;
      //  status = "Scheduled";
       // System.out.println("Appointment rescheduled!");
   // }
// abstract methods from services that appointments must implement
    @Override
    void getServiceDetails() {
    }

    @Override
    void serviceStatus() {
        System.out.println("Appointment done!");

    }
}



