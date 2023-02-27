package homework.homework15.medicalCenter.model;

import homework.homework15.medicalCenter.Profession;

import java.util.Objects;

public class Doctor extends Person {

    // Doctor's own data
    private Profession profession;

    // CONSTRUCTORS:
    public Doctor(String id, String name, String surname, String email, String phoneNumber, Profession profession) {
        super(id, name, surname, email, phoneNumber);
        this.profession = profession;
    }
    public Doctor() {
    }

    // GETTERS, SETTERS:
    public Profession getProfession() { return profession; }
    public void setProfession(Profession profession) { this.profession = profession; }

    // OVERRIDES:
    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + super.id + '\'' +
                ", name='" + super.name + '\'' +
                ", surname='" + super.surname + '\'' +
                ", email='" + super.email + '\'' +
                ", phoneNumber='" + super.phoneNumber + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(super.id, doctor.id)
                && Objects.equals(super.name, doctor.name)
                && Objects.equals(super.surname, doctor.surname)
                && Objects.equals(super.email, doctor.email)
                && Objects.equals(super.phoneNumber, doctor.phoneNumber)
                && Objects.equals(profession, doctor.profession);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.id, super.name, super.surname,
                super.email, super.phoneNumber, profession);
    }

}
