package system;
/*
This holds info about the food that the pet need
 */
public class Food {

    String type;
    float amount_of_food;;
    String food_expiration;
    String allergies;


    // constructors
    public Food(String type, float amount_of_food, String food_expiration,
                String allergies) {
        this.type = type;
        this.amount_of_food = amount_of_food;
        this.food_expiration = food_expiration;
        this.allergies = allergies;


    }

    // setters and getters
    public String getType() {
        return type;
    }
    public float getAmount_of_food() {
        return amount_of_food;
    }
    public String getFood_expiration() {
        return food_expiration;
    }
    public String getAllergies() {
        return allergies;
    }

    // convert to string
    @Override
    public String toString() {
        return "Food{" +
                "type='" + type + '\'' +
                ", amount_of_food=" + amount_of_food +
                ", food_expiration=" + food_expiration +
                ", allergies='" + allergies + '\'' +
                '}';
    }

}
