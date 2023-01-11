package myJavaProjects;

import java.util.Scanner;

public class AdminAndUserReg {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(ConsoleColors.CYAN + "Hello, this is a simple Java program.");
        System.out.println("Тry it and tell me if you like it!" + ConsoleColors.RESET);
        System.out.print("\n");
        System.out.print("username: ");
        String username = scan.nextLine();
        System.out.print("password: ");
        String password = scan.nextLine();
        System.out.print("\n");

        // if admin , if user:
        if (username.equals("Vahe") && password.equals("Vahe123")) {
            System.out.println(ConsoleColors.YELLOW + "open admin workspace..." + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Hello " + username + "<3" + ConsoleColors.RESET);
        }
        if (!username.equals("Vahe") || !password.equals("Vahe123")) {
            System.out.println("Hello " + username + "!");
            System.out.println("check out our program!");
            System.out.println("and have a good time!");
        }

        // if username or password are empty
        if (username.equals("")) {
            System.out.println(ConsoleColors.RED + "ERROR, USERNAME CANNOT BE EMPTY! TRY AGAIN!" + ConsoleColors.RESET);
            System.out.print("username: ");
            username = scan.nextLine();
        }
        if (password.equals("")) {
            System.out.println(ConsoleColors.RED + "ERROR, PASSWORD CANNOT BE EMPTY! TRY AGAIN!" + ConsoleColors.RESET);
            System.out.print("password: ");
            password = scan.nextLine();
        }

        // program evaluation
        System.out.print("\n");
        System.out.println(ConsoleColors.PURPLE + "please rate our program from 1 to 5!" + ConsoleColors.RESET);
        int grade = scan.nextInt();
        if (grade > 5 || grade < 1) {
            System.out.println(ConsoleColors.PURPLE + "1 TO 5 !!!" + ConsoleColors.RESET);
            grade = scan.nextInt();
        }
        if (grade > 1 && grade < 5) {
            System.out.println(ConsoleColors.CYAN + "Thanks <3" + ConsoleColors.RESET);
        }
        System.gc();
    }

    public static class ConsoleColors {
        // Reset
        public static final String RESET = "\033[0m";  // Text Reset

        // Regular Colors
        public static final String RED = "\033[0;31m";     // RED
        public static final String YELLOW = "\033[0;33m";  // YELLOW
        public static final String BLUE = "\033[0;34m";    // BLUE
        public static final String PURPLE = "\033[0;35m";  // PURPLE
        public static final String CYAN = "\033[0;36m";    // CYAN

    }
}
