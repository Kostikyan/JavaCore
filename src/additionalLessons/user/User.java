package additionalLessons.user;

import java.util.Scanner;

public class User {

    protected final static Scanner sc = new Scanner(System.in);
    protected String name, surname, password, email;

    User() {
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("surname: ");
        surname = sc.nextLine();
        System.out.print("password: ");
        password = sc.nextLine();
        System.out.print("email: ");
        email = sc.nextLine();

    }

}
