package homework.homework14.medicalCenter.model;

import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;

public class Patient{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM HH:m");

    private String id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Doctor doctor;
    private Date dateOfReg;

    public Patient(String id, String name, String surname, String email, String phoneNumber, Doctor doctor, Date dateOfReg) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.doctor = doctor;
        this.dateOfReg = dateOfReg;
    }
    public Patient(){}

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

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

    public void setDateOfReg(Date dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doctor=" + doctor +
                ", dateOfReg=" + sdf.format(dateOfReg) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(email, patient.email) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(doctor, patient.doctor) && Objects.equals(dateOfReg, patient.dateOfReg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, phoneNumber, doctor, dateOfReg);
    }
}
