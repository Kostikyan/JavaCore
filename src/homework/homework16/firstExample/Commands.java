package homework.homework16.firstExample;

public interface Commands {
    String EXIT = "1";
    String IS_IN = "2";
    String DELETE_NAME = "3";
    String SET_NAME = "4";

    static void printCommands(){
        System.out.println("input: " + EXIT + " for exit");
        System.out.println("       " + IS_IN + " for find out if such a name is on the list");
        System.out.println("       " + DELETE_NAME + " for delete name");
        System.out.println("       " + SET_NAME + " for set name");
    }
}
