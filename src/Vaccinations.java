import java.time.LocalDateTime;

public class Vaccinations extends Services {
    String vaccinationId;

    public Vaccinations(Pet pet, String name, String description, String status) {
        super(pet, name, description, status);
    }

    @Override
    public String toString() {
        return "Vaccinations{" +
                "pet = " + pet +
                ", name = " + name +
                ", description = " + description +
                ", status = " + status +
                '}';
    }

    @Override
    void getServiceDetails() {
        return ;
    }

    @Override
    void serviceStatus() {
        System.out.println("Vaccination done!");
    }
}
