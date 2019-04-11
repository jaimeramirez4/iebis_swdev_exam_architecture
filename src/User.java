public class User {

    enum Gender {Male, Female};
    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;

    public User(UserBuilder builder)  {

    }


    public String getEmailAddress() {
        return this.emailAddress;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddres() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getZipCode() {
        return this.zipCode;
    }

}

}