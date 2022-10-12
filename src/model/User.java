public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }


    public void getFullName() {

        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {

        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {

        return age;
    }

    public boolean isUserAdult() {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
