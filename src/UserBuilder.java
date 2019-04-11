public class UserBuilder {

    private String name;
    private String emailAddress;
    private  int age;
    private  String address;
    private  String city;
    private  String zipCode;

    public UserBuilder(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder city(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }



    public User build() {

        return new User(this);
    }


