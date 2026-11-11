public class Food {
    Pet pet1;
    String type;
    String favourite_food;
    float amount_of_food;
    int frequency_intake;
    int food_expiration;
    String allergies;


    public Food(String type, String favourite_food, float amount_of_food, int frequency_intake, int food_expiration,
                String allergies) {
        this.type = type;
        this.favourite_food = favourite_food;
        this.amount_of_food = amount_of_food;
        this.frequency_intake = frequency_intake;
        this.food_expiration = food_expiration;
        this.allergies = allergies;


    }

    public Food() {

    }

    // setters and getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFavourite_food() {
        return favourite_food;
    }

    public void setFavourite_food(String favourite_food) {
        this.favourite_food = favourite_food;
    }

    public float getAmount_of_food() {
        return amount_of_food;
    }

    public void setAmount_of_food(float amount_of_food) {
        this.amount_of_food = amount_of_food;
    }

    public int getFrequency_intake() {
        return frequency_intake;
    }

    public void setFrequency_intake(int frequency_intake) {
        this.frequency_intake = frequency_intake;
    }

    public int getFood_expiration() {
        return food_expiration;
    }

    public void setFood_expiration(int food_expiration) {
        this.food_expiration = food_expiration;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }


}




