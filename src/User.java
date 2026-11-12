public class User {
    String UserId;
    String name;
    String gender;
    int phone_number;
    String email;

    // constructor
    public User(String userId,String name, String gender, int phone_number,String email) {
        UserId = userId;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public User() {

    }

    // setters and getters
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }
}
