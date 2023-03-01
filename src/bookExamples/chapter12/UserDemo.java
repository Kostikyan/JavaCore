package bookExamples.chapter12;

import java.util.Scanner;

public class UserDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.name = "Poxos";
        user.surname = "Poxosyan";
        Language[] values = Language.values();
        System.out.println("choose language");
        for (Language value : values) {
            System.out.println(value);
        }
        String langStr = scanner.nextLine();
        try {
            user.language = Language.valueOf(langStr);
            System.out.println(user.language);
            System.out.println("You choose " + user.language.getCountry() + " country");
            System.out.println("Ordinal " + user.language.ordinal());
        }catch(IllegalArgumentException e){
            System.out.println("Please choose correct language");
        }
    }

}
