package system;

import java.util.ArrayList;
import java.util.List;

// info about the pet
public class Pet {
    private  String name ;
    private  String type;
    private String breed;
    private float weight;
    private int age;

    //  a container so that the pets store vaccination, medication and app and food
    // the services for each pet never mixes
    List<Appointments> Appointments = new ArrayList<>();
    List<Medications> Medications = new ArrayList<>();
    List<Vaccinations> Vaccinations = new ArrayList<>();
    List<Food> Foods = new ArrayList<>();


    //  constructors
    public Pet(String name, String type, float weight, String breed, int age){
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.breed = breed;
        this.age = age;

    }

    //  // convert to readable string
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", Appointments=" + Appointments +
                // ", Medications=" + Medications +
                //", Vaccination=" + Vaccination +
                ", Food=" + Foods +
                '}';
    }
    // GETTERS
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getType() {
        return type;
    }
    public float getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }


    //to get the service on the pet objects  an empty container to hold
    public List<Appointments> getAppointments() {
        return Appointments;
    }
    public List<Medications> getMedications(){
        return Medications;
    }
    public List<Vaccinations> getVacccinations(){
        return Vaccinations;
    }
    public List<Food> getFoods(){
        return Foods;
    }

}