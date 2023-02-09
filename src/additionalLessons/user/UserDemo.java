package additionalLessons.user;

import java.util.Scanner;

public class UserDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Storage
        DynamicStrArray dsa = new DynamicStrArray();

        // boolean for inf run OR if input 0 -> end program
        boolean isRun = true;

        // inf while
        while (isRun) {

            // print commands
            System.out.println("input: 0) for exit");
            System.out.println("       1) for add user");
            System.out.println("       2) for print all users");
            System.out.println("       3) search user by name");
            System.out.println("       4) search user by surname");
            System.out.println("       5) search user by email");

            // input command number
            String command = sc.nextLine();

            // check command number
            switch (command) {

                // if command = 0  ->  end program
                case "0":
                    isRun = false;
                    break;

                // if command = 1  ->  adding new user
                case "1":
                    System.out.print("\ninput name: ");
                    String name = sc.nextLine();
                    System.out.print("input surname: ");
                    String surname = sc.nextLine();
                    System.out.print("input password: ");
                    String password = sc.nextLine();
                    System.out.print("input email: ");
                    String email = sc.nextLine();

                    while (!email.contains("@") && (!email.endsWith(".ru") || !email.endsWith(".com"))) {
                        System.out.println("WRONG EMAIL FORMAT, TRY AGAIN!");
                        email = sc.nextLine();
                    }

                    User user = new User(name, surname, password, email);
                    dsa.add(user);

                    System.out.println("\nUser was added");
                    break;

                // if command = 2  ->  print all users
                case "2":
                    dsa.print();
                    break;

                // if command = 3  ->  search user by name
                case "3":
                    System.out.print("please input user's name: ");
                    String nameSearch = sc.nextLine();
                    dsa.searchByName(nameSearch);
                    break;

                // if command = 4  ->  search user by surname
                case "4":
                    System.out.print("please input user's surname: ");
                    String surnameSearch = sc.nextLine();
                    dsa.searchBySurname(surnameSearch);
                    break;

                // if command = 5  ->  search user by email
                case "5":
                    System.out.print("please input user's email: ");
                    String emailSearch = sc.nextLine();
                    dsa.searchByEmail(emailSearch);
                    break;

                // if inputted command wrong
                default:
                    System.out.println("wrong command please try again!");
            }
        }

    }

}
