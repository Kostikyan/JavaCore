package homework.homework15.medicalCenter.model;

public class Person {

    // Parent of Patient and Doctor classes
    // Here are common variables and class methods

    // General data of the patient and doctor
    protected String id;
    protected String name;
    protected String surname;
    protected String email;
    protected String phoneNumber;

    // CONSTRUCTORS:
    public Person(String id, String name, String surname, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Person() {
    }

    // GETTERS, SETTERS:
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

}