package homework.homework16.firstExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 implements Commands {

    // Objects:
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> nameList = new ArrayList<>() {{
        add("Vahe");
        add("Vage");
        add("Vanya");
        add("Vaye");
        add("Vah");
    }};
    
    public static void main(String[] args) {
        
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
                    nameSeeker();
                }

                // 3) delete name from list
                case DELETE_NAME -> {
                    deleteName();
                }

                // 4) set name
                case SET_NAME -> {
                    setName();
                }

                // wrong command
                default -> System.out.println("Unexpected value: " + command);
            }
        }

    }

    private static void setName() {
        System.out.print("input name: ");
        String setName = scanner.nextLine();
        System.out.print("input index: ");
        String setIndex = scanner.nextLine();

        int parseIndex;
        try {
            parseIndex = Integer.parseInt(setIndex);
        } catch (NumberFormatException nfe) {
            System.out.println("The index cannot be a letter!");
            return;
        }

        try {
            nameList.set(parseIndex, setName);
        } catch (IndexOutOfBoundsException io) {
            System.out.println("Wrong Index! there are no name under this index!");
            return;
        }

        System.out.println(nameList);
        System.out.println("the name is successfully put on index " + parseIndex);
    }

    private static void deleteName() {
        System.out.print("input name: ");
        String deleteName = scanner.nextLine();
        if (nameList.remove(deleteName)) {
            System.out.println("Name deleted!");
            System.out.println(nameList);
        } else {
            System.out.println("No " + '\'' + deleteName + '\'' + " found in the list of names");
        }
    }

    private static void nameSeeker() {
        System.out.print("input name: ");
        String checkName = scanner.nextLine();
        if (nameList.contains(checkName)) {
            System.out.println("there is such a name on the list!");
            System.out.print("index: " + nameList.indexOf(checkName) + "\n");
        } else {
            System.out.println("No " + '\'' + checkName + '\'' + " found in the list of names");
        }
    }
}
