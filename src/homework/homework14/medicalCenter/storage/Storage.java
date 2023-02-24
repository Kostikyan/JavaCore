package homework.homework14.medicalCenter.storage;

import homework.homework14.medicalCenter.model.Doctor;
import homework.homework14.medicalCenter.model.Patient;
import homework.homework14.medicalCenter.util.DateUtil;

import java.util.Date;

public class Storage {

    DateUtil du = new DateUtil();

    private Doctor[] dcArray = new Doctor[10];
    private int size = 0;

    private Patient[] ptArray = new Patient[10];
    private int size2 = 0;

    public void addDoctor(Doctor value) {
        if (size == dcArray.length) {
            extendD();
        }
        dcArray[size++] = value;
    }

    private void extendD() {
        Doctor[] newArr = new Doctor[dcArray.length + 10];
        System.arraycopy(dcArray, 0, newArr, 0, dcArray.length);
        dcArray = newArr;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            System.out.println(dcArray[i]);
        }
    }

    public void addPatient(Patient value) {
        if (size2 == ptArray.length) {
            extendP();
        }
        ptArray[size2++] = value;
    }

    private void extendP() {
        Patient[] newArr = new Patient[ptArray.length + 10];
        System.arraycopy(ptArray, 0, newArr, 0, ptArray.length);
        ptArray = newArr;
    }

    public void printPatients() {
        for (int i = 0; i < size2; i++) {
            System.out.println(ptArray[i]);
        }
    }

    public Doctor searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = dcArray[i];
            if (doctor.getProfession().equals(profession)) {
                return doctor;
            }
        }
        return null;
    }

    public void deleteDoctorById(String delId) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = dcArray[i];
            if (doctor.getId().equals(delId)) {
                dcArray[i] = null;
                System.out.println("Doctor with id " + delId + " successfully removed!");
                return;
            }
        }
        System.out.println("Doctor with id " + delId + " not found");
    }

    public boolean idChecker(String changeId) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = dcArray[i];
            if (doctor.getId().equals(changeId)) {
                return true;
            }
        }
        return false;
    }

    public Doctor getDoctorById(String changeId) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = dcArray[i];
            if (doctor.getId().equals(changeId)) {
                return doctor;
            }
        }
        return null;
    }

    public boolean dateChecker(Date date) {
        for (int i = 0; i < size2; i++) {
            Patient patient = ptArray[i];
            if (patient.getDateOfReg().equals(date)) {
                return false;
            }
        }
        return true;
    }

    public void printAllPatientsByDoctor(String doctorID) {
        boolean found = false;
        Doctor dc = getDoctorById(doctorID);
        for (int i = 0; i < size2; i++) {
            Patient pt = ptArray[i];
            if(pt.getDoctor().equals(dc)){
                System.out.println(pt);
                found = true;
            }
        }
        if(!found){
            System.out.println("doctor with id " + doctorID + " not found");
        }
    }

    public int getSizeDoctor() {
        return size;
    }

    public int getSizePatient() {
        return size2;
    }

    public void printTodaysPatients() {
        boolean found = false;
        Date date = new Date();
        for (int i = 0; i < size2; i++) {
            Patient patient = ptArray[i];
            if(du.checkEqualDate(date, patient.getDateOfReg())){
                System.out.println(patient);
                found = true;
            }
        }
        if(!found){
            System.out.println("No patients today!");
        }
    }
}