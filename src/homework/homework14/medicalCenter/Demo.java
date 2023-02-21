package homework.homework14.medicalCenter;

import homework.homework14.medicalCenter.model.Doctor;
import homework.homework14.medicalCenter.model.Patient;
import homework.homework14.medicalCenter.storage.Storage;
import homework.homework14.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;

public class Demo implements Commands {

    static Scanner sc = new Scanner(System.in);
    static Storage storage = new Storage();
    static DateUtil du = new DateUtil();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = sc.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.print("input id: ");
                    String delId = sc.nextLine();
                    storage.deleteDoctorById(delId);
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    storage.printTodaysPatients();
                    break;
                default:
                    System.out.println("wrong command!");
            }
        }

    }

    private static void printAllPatientsByDoctor() {
        storage.printDoctors();
        System.out.println("Choose Doctor!");
        System.out.print("input doctor's id: ");
        String doctorID = sc.nextLine();
        storage.printAllPatientsByDoctor(doctorID);
    }

    private static void addPatient() throws ParseException {

        if (storage.getSizeDoctor() == 0) {
            System.out.println("There is no doctor");
        } else {

            storage.printDoctors();
            System.out.println("Choose doctor!");
            System.out.print("input doctor's id: ");
            String patientsDoctorId = sc.nextLine();
            Doctor patientsDoctor = storage.getDoctorById(patientsDoctorId);
            if (patientsDoctor == null) {
                System.out.println("Doctor with id " + patientsDoctorId + " not found");
            } else {
                System.out.print("input id: ");
                String patientId = sc.nextLine();
                System.out.print("input name: ");
                String patientName = sc.nextLine();
                System.out.print("input surname: ");
                String patientSurname = sc.nextLine();
                System.out.print("input email: ");
                String patientEmail = sc.nextLine();

                boolean ec = emailChecker(patientEmail);
                while (!ec) {
                    System.out.println("wrong email format, try again! (ex@mail.ru, ex@gmail.com");
                    patientEmail = sc.nextLine();
                    ec = emailChecker(patientEmail);
                }

                System.out.print("input phone number: ");
                String patientPhoneNumber = sc.nextLine();


                Date date;
                System.out.print("input date (dd/MM/yyyy hh:mm): ");
                String dateSTR = sc.nextLine();
                date = du.ddMMyyyyHHm.parse(dateSTR);

                if (storage.dateChecker(date)) {
                    Patient patient = new Patient(patientId, patientName, patientSurname, patientEmail, patientPhoneNumber, patientsDoctor, date);
                    storage.addPatient(patient);
                    System.out.println("Patient successfully registered");
                } else {
                    System.out.println("This date is already booked");
                }
            }
        }
    }

    private static void changeDoctorDataById() {
        System.out.print("input id: ");
        String changeId = sc.nextLine();
        boolean idCheck = storage.idChecker(changeId);
        if (idCheck) {
            Doctor doctorDataChange = storage.getDoctorById(changeId);
            System.out.print("input name: ");
            String newName = sc.nextLine();
            System.out.print("input surname: ");
            String newSurname = sc.nextLine();
            System.out.print("input email: ");
            String newEmail = sc.nextLine();

            boolean ec = emailChecker(newEmail);
            while (!ec) {
                System.out.println("wrong email format, try again! (ex@mail.ru, ex@gmail.com)");
                newEmail = sc.nextLine();
                ec = emailChecker(newEmail);
            }

            System.out.print("input phone number: ");
            String newPhoneNumber = sc.nextLine();
            System.out.print("input profession: ");
            String newProfession = sc.nextLine();

            doctorDataChange.setName(newName);
            doctorDataChange.setSurname(newSurname);
            doctorDataChange.setEmail(newEmail);
            doctorDataChange.setPhoneNumber(newPhoneNumber);
            doctorDataChange.setProfession(newProfession);

            System.out.println("Doctor information successfully changed");
            System.out.println(doctorDataChange);

        }
    }

    private static void searchDoctorByProfession() {
        System.out.print("input profession: ");
        String searchProfession = sc.nextLine();
        Doctor dc = storage.searchDoctorByProfession(searchProfession);
        if (dc != null) {
            System.out.println(dc);
        } else {
            System.out.println("Profession " + searchProfession + " not found!");
        }
    }

    private static void addDoctor() {
        System.out.print("input id: ");
        String doctorId = sc.nextLine();
        System.out.print("input name: ");
        String doctorName = sc.nextLine();
        System.out.print("input surname: ");
        String doctorSurname = sc.nextLine();
        System.out.print("input email: ");
        String doctorEmail = sc.nextLine();
        boolean ec = emailChecker(doctorEmail);
        while (!ec) {
            System.out.println("wrong email format, try again! (ex@mail.ru, ex@gmail.com");
            doctorEmail = sc.nextLine();
            ec = emailChecker(doctorEmail);
        }
        System.out.print("input phone number: ");
        String doctorPhoneNumber = sc.nextLine();
        System.out.print("input profession: ");
        String doctorProfession = sc.nextLine();

        Doctor newDoctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail, doctorPhoneNumber, doctorProfession);
        storage.addDoctor(newDoctor);
        System.out.println("Doctor successfully added!");
    }

    private static boolean emailChecker(String email) {
        return email.contains("@") && (email.endsWith(".ru") || email.endsWith(".com"));
    }

}
