package system;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;


public class User {
    String name;
    String gender;
    int phone_number;
    String email;

    // container that stores the users pets- declaring
    List<Pet> pets = new ArrayList<Pet>();

    // constructor
    public User(String name, String gender, int phone_number,String email) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    // to string methods to have printed everything to string

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }

    // methods get pet with all the objects it has
    public List<Pet> getPets(){
        return pets;
    }

    // adding the pets to the user
    public void addpet(Pet pet){
        pets.add(pet);
    }
}


