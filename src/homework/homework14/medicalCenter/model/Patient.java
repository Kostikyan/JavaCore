package homework.homework14.medicalCenter.model;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {


    public Patient(String id, String name, String surname, String email, String phoneNumber, Doctor doctor, Date dateOfReg) {
        super(id, name, surname, email, phoneNumber, doctor, dateOfReg);
    }

    public Patient() {
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id='" + super.id + '\'' +
                ", name='" + super.name + '\'' +
                ", surname='" + super.surname + '\'' +
                ", email='" + super.email + '\'' +
                ", phoneNumber='" + super.phoneNumber + '\'' +
                ", doctor=" + super.doctor +
                ", dateOfReg=" + du.ddMMyyyyHHm.format(super.dateOfReg) +
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
