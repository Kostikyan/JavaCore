package homework.homework15.medicalCenter.storage;

import homework.homework15.medicalCenter.Profession;
import homework.homework15.medicalCenter.model.Doctor;
import homework.homework15.medicalCenter.model.Patient;
import homework.homework15.medicalCenter.model.Person;
import homework.homework15.medicalCenter.util.DateUtil;

import java.util.Date;

public class Storage {

    DateUtil du = new DateUtil();

    private Person[] storage = new Person[10];
    private int size = 0;

    public void addPerson(Person value) {
        if (size == storage.length) {
            extend();
        }
        storage[size++] = value;
    }

    private void extend() {
        Person[] newArr = new Person[storage.length + 10];
        System.arraycopy(storage, 0, newArr, 0, storage.length);
        storage = newArr;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                System.out.println(storage[i]);
            }
        }
    }

    /*  chei ogragorce hech mi tex
        seci petq karoxa ga dur hamar
        koment sargeci))

    public void printPatients() {
       for (int i = 0; i < size; i++) {
           if (storage[i] instanceof Patient) {
               System.out.println(storage[i]);
           }
       }
       }
    */

    public Person searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                Person doctor = storage[i];
                if (doctor.getProfession().equals(profession)) {
                    return doctor;
                }
            }
        }
        return null;
    }

    public void deleteDoctorById(String delId) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                Person doctor = storage[i];
                if (doctor.getId().equals(delId)) {
                    storage[i] = null;
                    System.out.println("Doctor with id " + delId + " successfully removed!");
                    return;
                }
            }
        }
        System.out.println("Doctor with id " + delId + " not found");
    }

    public boolean idChecker(String changeId) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                Person doctor = storage[i];
                if (doctor.getId().equals(changeId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Person getDoctorById(String changeId) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                Person doctor = storage[i];
                if (doctor.getId().equals(changeId)) {
                    return doctor;
                }
            }
        }
        return null;
    }

    public boolean dateChecker(Date date) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                Person patient = storage[i];
                if (patient.getDateOfReg().equals(date)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printAllPatientsByDoctor(String doctorID) {
        boolean found = false;
        Person dc = getDoctorById(doctorID);
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                Person pt = storage[i];
                if (pt.getDoctor().equals(dc)) {
                    System.out.println(pt);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("doctor with id " + doctorID + " not found");
        }
    }

    public int getSize() {
        return size;
    }

    public void printTodaysPatients() {
        boolean found = false;
        Date date = new Date();
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                Person patient = storage[i];
                if (du.checkEqualDate(date, patient.getDateOfReg())) {
                    System.out.println(patient);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No patients today!");
        }
    }
}