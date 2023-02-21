package homework.homework14.medicalCenter;
public interface Commands {

    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TODAYS_PATIENTS = "7";

    static void printCommands(){
        System.out.println("input: " + EXIT + ") for exit");
        System.out.println("       " + ADD_DOCTOR + ") for add doctor");
        System.out.println("       " + SEARCH_DOCTOR_BY_PROFESSION + ") for search doctor by profession");
        System.out.println("       " + DELETE_DOCTOR_BY_ID + ") for delete doctor by id");
        System.out.println("       " + CHANGE_DOCTOR_DATA_BY_ID + ") for change doctor data by id");
        System.out.println("       " + ADD_PATIENT + ") for add patient");
        System.out.println("       " + PRINT_ALL_PATIENTS_BY_DOCTOR + ") for print patients by doctor");
        System.out.println("       " + PRINT_TODAYS_PATIENTS + ") for print all today's patients");
    }

}
