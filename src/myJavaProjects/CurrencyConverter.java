package myJavaProjects;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amount;
        double ruble, dollar, pound, euro, yen;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("    Enter 1: Rubles");
        System.out.println("    Enter 2: Dollar");
        System.out.println("    Enter 3: Pound");
        System.out.println("    Enter 4: Euro");
        System.out.println("    Enter 5: Yen");

        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (choice) {
            case 1:  // Ruble Conversion
                dollar = amount / 70;
                System.out.println(amount + " Ruble = " + f.format(dollar) + " Dollar");

                pound = amount / 88;
                System.out.println(amount + " Ruble = " + f.format(pound) + " Pound");

                euro = amount / 80;
                System.out.println(amount + " Ruble = " + f.format(euro) + " Euro");

                yen = amount / 0.63;
                System.out.println(amount + " Ruble = " + f.format(yen) + " Yen");
                break;

            case 2:  // Dollar Conversion
                ruble = amount * 70;
                System.out.println(amount + " Dollar = " + f.format(ruble) + " Ruble");

                pound = amount * 0.78;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount * 0.87;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                yen = amount *111.087;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
                break;

            case 3:  // Pound Conversion
                ruble = amount * 88;
                System.out.println(amount + " pound = " + f.format(ruble) + " Ruble");

                dollar = amount *1.26;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                euro = amount *1.10;
                System.out.println(amount + " pound = " + f.format(euro) + " Euro");

                yen = amount *140.93;
                System.out.println(amount + " pound = " + f.format(yen) + " Yen");
                break;

            case 4:  // Euro Conversion
                ruble = amount * 80;
                System.out.println(amount + " euro = " + f.format(ruble) + " Ruble");

                dollar = amount *1.14;
                System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

                pound = amount *0.90;
                System.out.println(amount + " euro = " + f.format(pound) + " Pound");

                yen = amount *127.32;
                System.out.println(amount + " euro = " + f.format(yen) + " Yen");
                break;

            case 5:  // Yen Conversion
                ruble = amount *0.63;
                System.out.println(amount + " yen = " + f.format(ruble) + " Ruble");

                dollar = amount *0.008;
                System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");

                pound = amount *0.007;
                System.out.println(amount + " yen = " + f.format(pound) + " Pound");

                euro = amount *0.007;
                System.out.println(amount + " yen = " + f.format(euro) + " Euro");
                break;

            //Default case
            default:
                System.out.println("Invalid Input");
        }
    }
}