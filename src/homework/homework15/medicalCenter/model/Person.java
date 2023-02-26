package homework.homework15.medicalCenter.model;

import homework.homework15.medicalCenter.Profession;
import homework.homework15.medicalCenter.util.DateUtil;

import java.util.Date;

public class Person {

    protected DateUtil du = new DateUtil();

    protected String id;
    protected String name;
    protected String surname;
    protected String email;
    protected String phoneNumber;
    protected Profession profession;
    protected Doctor doctor;
    protected Date dateOfReg;

    public Person(String id, String name, String surname, String email, String phoneNumber, Profession profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
    }

    public Person(String id, String name, String surname, String email, String phoneNumber, Doctor doctor, Date dateOfReg) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.doctor = doctor;
        this.dateOfReg = dateOfReg;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getPhoneNumber() {  petq cher)
//        return phoneNumber;
//    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

//    public void setDateOfReg(Date dateOfReg) { sigel petq cher)
//        this.dateOfReg = dateOfReg;
//    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

}
