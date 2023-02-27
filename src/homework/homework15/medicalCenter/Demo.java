package homework.homework15.medicalCenter;

import homework.homework15.medicalCenter.model.Doctor;
import homework.homework15.medicalCenter.model.Patient;
import homework.homework15.medicalCenter.storage.Storage;
import homework.homework15.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Demo implements Commands {

    static private final Scanner sc = new Scanner(System.in);
    static private final Storage storage = new Storage();
    static private final Profession[] values = Profession.values();

    private static boolean isValidEmail(String email) {
        return email.contains("@") && (email.endsWith(".ru") || email.endsWith(".com"));
    }

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
                    if(storage.getSize() == 0) {
                        System.out.println("There is no doctor!");
                    }else {
                        searchDoctorByProfession();
                    }
                    break;
                case DELETE_DOCTOR_BY_ID:
                    if(storage.getSize() == 0) {
                        System.out.println("There is no doctor!");
                    }else {
                        storage.printDoctors();
                        System.out.println("Choose doctor!");
                        System.out.print("input id: ");
                        String delId = sc.nextLine();
                        storage.deleteDoctorById(delId);
                    }
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    if(storage.getSize() == 0) {
                        System.out.println("There is no doctor!");
                    }else{
                        changeDoctorDataById();
                    }
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    if(storage.getSize() == 0) {
                        System.out.println("There is no doctor!");
                    }else {
                        printAllPatientsByDoctor();
                    }
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

        Doctor doctor = storage.getDoctorById(doctorID);
        if (doctor == null) {
            System.out.println("Doctor with id " + doctorID + " not found!");
        } else{
            storage.printAllPatientsByDoctor(doctor);
        }

    }

    private static void addPatient() {

        if (storage.getSize() == 0) {
            System.out.println("There is no doctor!");
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

                boolean ec = isValidEmail(patientEmail);
                while (!ec) {
                    System.out.println("wrong email format, try again! (ex@mail.ru, ex@gmail.com)");
                    System.out.print("email: ");
                    patientEmail = sc.nextLine();
                    ec = isValidEmail(patientEmail);
                }

                System.out.print("input phone number: ");
                String patientPhoneNumber = sc.nextLine();

                Date date;
                System.out.print("input date (dd/MM/yyyy hh:mm): ");
                String dateSTR = sc.nextLine();

                try {
                    date = DateUtil.dateMinute.parse(dateSTR);
                } catch (ParseException e) {
                    System.out.println("Error: wrong date format! example (12/08/2000 12:30)");
                    return;
                }

                if(DateUtil.registeredPatientDateChecker(date)) {
                    if (storage.dateChecker(date)) {
                        Patient patient = new Patient(patientId, patientName, patientSurname, patientEmail,
                                patientPhoneNumber, patientsDoctor, date);
                        storage.addPerson(patient);
                        System.out.println("Patient successfully registered");
                    } else {
                        System.out.println("This date is already booked");
                    }
                }else{
                    System.out.println("The time you have given is already in the past!");
                }
            }
        }
    }

    private static void changeDoctorDataById() {
        storage.printDoctors();
        System.out.println("Choose the id of the doctor whose data you want to change!");
        System.out.print("input id: ");
        String changeId = sc.nextLine();
        boolean idCheck = storage.idChecker(changeId);
        if (idCheck) {
            System.out.println("Doctor with id " + changeId + " found!");
            Doctor doctorDataChange = storage.getDoctorById(changeId);
            System.out.println(doctorDataChange);

            System.out.println("Now input new data!");
            System.out.print("name: ");
            String newName = sc.nextLine();
            System.out.print("surname: ");
            String newSurname = sc.nextLine();
            System.out.print("email: ");
            String newEmail = sc.nextLine();

            boolean ec = isValidEmail(newEmail);
            while (!ec) {
                System.out.println("wrong email format, try again! (ex@mail.ru, ex@gmail.com)");
                System.out.print("email: ");
                newEmail = sc.nextLine();
                ec = isValidEmail(newEmail);
            }

            System.out.print("phone number: ");
            String newPhoneNumber = sc.nextLine();

            System.out.println("Choose profession!");
            for (Profession value : values) {
                System.out.println(value);
            }

            System.out.print("profession: ");
            String newProfession = sc.nextLine();

            doctorDataChange.setName(newName);
            doctorDataChange.setSurname(newSurname);
            doctorDataChange.setEmail(newEmail);
            doctorDataChange.setPhoneNumber(newPhoneNumber);

            try {
                doctorDataChange.setProfession(Profession.valueOf(newProfession));
            } catch (IllegalArgumentException e) {
                System.out.println("Profession " + newProfession + " not found!");
                return;
            }

            System.out.println("Doctor information successfully changed");
            System.out.println(doctorDataChange);

        }else{
            System.out.println("Doctor with id " + changeId + " not found!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Choose profession!");

        for (Profession value : values) {
            System.out.println(value);
        }

        System.out.print("input profession: ");
        String searchProfession = sc.nextLine();
        Doctor dc;

        try {
            dc = storage.searchDoctorByProfession(Profession.valueOf(searchProfession));
        } catch (IllegalArgumentException iae) {
            System.out.println("Profession " + searchProfession + " not found!");
            return;
        }

        if(dc != null) {
            System.out.println(dc);
        }else{
            System.out.println("There is no doctor with this profession!");
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

        boolean ec = isValidEmail(doctorEmail);
        while (!ec) {
            System.out.println("wrong email format, try again! (ex@mail.ru, ex@gmail.com");
            System.out.print("input email: ");
            doctorEmail = sc.nextLine();
            ec = isValidEmail(doctorEmail);
        }

        System.out.print("input phone number: ");
        String doctorPhoneNumber = sc.nextLine();

        System.out.println("Choose profession!");
        for (Profession value : values) {
            System.out.println(value);
        }

        System.out.print("input profession: ");
        String doctorProfession = sc.nextLine();

        Doctor newDoctor;

        try {
            newDoctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail,
                    doctorPhoneNumber, Profession.valueOf(doctorProfession));
        } catch (IllegalArgumentException e) {
            System.out.println("No profession named " + doctorProfession + " found");
            return;
        }

        storage.addPerson(newDoctor);
        System.out.println("Doctor successfully added!");

    }

}