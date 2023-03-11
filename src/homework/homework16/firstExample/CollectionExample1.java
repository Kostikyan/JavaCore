package homework.homework16.firstExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 implements Commands {

    // Objects:
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // List:
        List<String> nameList = new ArrayList<>() {{
            add("Vahe");
            add("Vage");
            add("Vanya");
            add("Vaye");
            add("Vah");
        }};

        boolean isRun = true;
        while (isRun) {
            // from interface Commands use method printCommands
            Commands.printCommands();

            // input command
            String command = scanner.nextLine();

            switch (command) {
                // 1) end program
                case EXIT -> isRun = false;

                // 2) search name in List
                case IS_IN -> {
                    System.out.print("input name: ");
                    String checkName = scanner.nextLine();
                    if (nameList.contains(checkName)) {
                        System.out.println("there is such a name on the list!");
                        System.out.print("index: " + nameList.indexOf(checkName) + "\n");
                    } else {
                        System.out.println("No " + '\'' + checkName + '\'' + " found in the list of names");
                    }
                }

                // 3) delete name from list
                case DELETE_NAME -> {
                    System.out.print("input name: ");
                    String deleteName = scanner.nextLine();
                    if (nameList.contains(deleteName)) {
                        nameList.remove(deleteName);
                        System.out.println("Name deleted!");
                        System.out.println(nameList);
                    } else {
                        System.out.println("No " + '\'' + deleteName + '\'' + " found in the list of names");
                    }
                }

                // 4) set name
                case SET_NAME -> {
                    System.out.print("input name: ");
                    String setName = scanner.nextLine();
                    System.out.print("input index: ");
                    String setIndex = scanner.nextLine();
                    int parse;
                    try {
                        parse = Integer.parseInt(setIndex);
                    } catch (NumberFormatException nfe) {
                        System.out.println("The index cannot be a letter!");
                        break;
                    }
                    try {
                        nameList.set(parse, setName);
                    } catch (IndexOutOfBoundsException io) {
                        System.out.println("Wrong Index! there are no name under this index!");
                        break;
                    }
                    System.out.println(nameList);
                    System.out.println("the name is successfully put on index " + parse);
                }

                // wrong command
                default -> System.out.println("Unexpected value: " + command);
            }
        }

    }
}
