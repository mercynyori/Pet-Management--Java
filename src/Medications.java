public class Medications extends Services {


    public Medications(Pet pet, String name, String description, String status) {
        super(pet, name, description, status);
    }

    @Override
    public String toString() {
        return "Medications{" +
                "pet = " + pet +
                ", name = " + name +
                ", description = " + description +
                ", status = " + status +
                '}';
    }

    public void completedMedication(){
        status = "Completed";
        System.out.println(" Medication completed!");
    }

    @Override
    void getServiceDetails() {
    }

    @Override
    void serviceStatus() {
        System.out.println("Medication taken!");

    }
}
