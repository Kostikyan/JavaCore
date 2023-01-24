package additionalLessons.userData;

import java.util.Scanner;

public class User {

    private final Scanner sc = new Scanner(System.in);
    String name, surname, password, email;

    public final void enterUserData() {
        do {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter surname: ");
            surname = sc.nextLine();
            System.out.print("Enter password: ");
            password = sc.nextLine();
            System.out.print("Enter email: ");
            email = sc.nextLine();
            if (!name.equals("admin") || !password.equals("admin")) {
                System.out.println(ConsoleColors.RED + "\nERROR: Name or Password invalid" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + "Please Try Again!\n" + ConsoleColors.RESET);
            } else {
                System.out.println("\nHi " + name);
            }
        } while (!name.equals("admin") || !password.equals("admin"));

    }

    void userDataPrint() {
        System.out.println(ConsoleColors.CYAN + "\nname: " + name);
        System.out.println("surname: " + surname);
        System.out.println("password: " + password);
        System.out.println("email: " + email + ConsoleColors.RESET);
    }

    public static class ConsoleColors {
        public static final String RESET = "\033[0m";  // Text Reset
        public static final String RED = "\033[0;31m";     // RED
        public static final String CYAN = "\033[0;36m";    // CYAN
    }

}
