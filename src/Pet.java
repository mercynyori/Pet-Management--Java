import java.util.ArrayList;

public class Pet {
     String petId ;
     String name ;
     String type;
     float weight;
     double height;
     String User;
     String favorite_thing;
     String color;
     boolean petsitting;

    // i want have a container where all pets have their services and so on
    // arraylist
    ArrayList<Services> services = new ArrayList<>();


    //  constructors
    public Pet(String petId, String name, String type, float weight, double height,String User,String favorite_thing,
               String color,boolean petsitting){
        this.name = name;
        this.type = type;
        this.height = height;
        this.favorite_thing = favorite_thing;
        this.User = User;
        this.weight = weight;
        this.petsitting = petsitting;
        this.petId = petId;
        this.color = color;
    }

    public Pet() {

    }

    public Pet(String mercy) {
    }

    // convert to readable string
    @Override
    public String toString() {
        return "Pet{" +
                "petId='" + petId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", User='" + User + '\'' +
                ", favorite_thing='" + favorite_thing + '\'' +
                ", color='" + color + '\'' +
                ", petsitting=" + petsitting +
                '}';
    }

    // getters n setters
    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFavorite_thing() {
        return favorite_thing;
    }

    public void setFavorite_thing(String favorite_thing) {
        this.favorite_thing = favorite_thing;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPetsitting() {
        return petsitting;
    }

    public void setPetsitting(boolean petsitting) {
        this.petsitting = petsitting;
    }


    // u nedd to add to get the service on the pet objects
    // methods add service to the pet so when i call pets i can see the services associated
    public void addService(Services service) {
        services.add(service);
    }
    // if i call getservices i can retrive it
    public ArrayList<Services> getServices(){
        return services;
    }




}
