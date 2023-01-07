package myJavaProjects;

import java.util.Locale;
import java.util.Scanner;

public class IfHavePromocode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String promocode = "realsale";
        String wantBuy;
        int[] prices = {999, 699, 599, 349, 175};
        byte chNum = 0;

        System.out.println("Welcome to our hardware store\uD83D\uDC4B");
        System.out.println("Please select a product...");
        do {
            System.out.println("\t1)Iphone 14 - $" + prices[0]);
            System.out.println("\t2)Iphone 13 - $" + prices[1]);
            System.out.println("\t3)Iphone 12 - $" + prices[2]);
            System.out.println("\t4)Iphone 11 - $" + prices[3]);
            System.out.println("\t5)Iphone 10 - $" + prices[1]);
            System.out.println("\t6)Iphone 8 - $" + prices[4]);
            System.out.print("Enter product number: ");
            chNum = sc.nextByte();
        } while (chNum < 1 || chNum > 6);

        switch (chNum) {
            case 1:
                System.out.println("product: " + ConsoleColors.YELLOW + "Iphone 14" + ConsoleColors.RESET);
                System.out.println("price: " + ConsoleColors.YELLOW + "$" + prices[0] + ConsoleColors.RESET);
                break;
            case 2:
                System.out.println("product: " + ConsoleColors.YELLOW + "Iphone 13" + ConsoleColors.RESET);
                System.out.println("price: " + ConsoleColors.YELLOW + "$" + prices[1] + ConsoleColors.RESET);
                break;
            case 3:
                System.out.println("product: " + ConsoleColors.YELLOW + "Iphone 12" + ConsoleColors.RESET);
                System.out.println("price: " + ConsoleColors.YELLOW + "$" + prices[2] + ConsoleColors.RESET);
                break;
            case 4:
                System.out.println("product: " + ConsoleColors.YELLOW + "Iphone 11" + ConsoleColors.RESET);
                System.out.println("price: " + ConsoleColors.YELLOW + "$" + prices[3] + ConsoleColors.RESET);
                break;
            case 5:
                System.out.println("product: " + ConsoleColors.YELLOW + "Iphone 10" + ConsoleColors.RESET);
                System.out.println("price: " + ConsoleColors.YELLOW + "$" + prices[1] + ConsoleColors.RESET);
                break;
            case 6:
                System.out.println("product: " + ConsoleColors.YELLOW + "Iphone 10" + ConsoleColors.RESET);
                System.out.println("price: " + ConsoleColors.YELLOW + "$" + prices[4] + ConsoleColors.RESET);
                break;
        }
        String havePromo2;
        String havePromo1;
        do {
            System.out.print("You Have Promocode? yes/no : ");
            havePromo1 = sc.nextLine();
            havePromo2 = sc.nextLine();
        } while (!"no".equals(havePromo2.toLowerCase()) && !"yes".equals(havePromo2.toLowerCase()));

        if (havePromo2.toLowerCase().equals("yes")) {
            System.out.print("Enter your promocode: ");
            String promocodeCheck = sc.nextLine();
            if (promocodeCheck.toLowerCase().equals(promocode)) {
                System.out.println(ConsoleColors.RED + "Your promo code gives you 30% off" + ConsoleColors.RESET);
                switch (chNum) {
                    case 1:
                        System.out.println("Now you have to pay: " + ConsoleColors.GREEN + "$" + (prices[0] - (prices[0] * 30 / 100)) + ConsoleColors.GREEN);
                        break;
                    case 2:
                    case 5:
                        System.out.println("Now you have to pay: " + ConsoleColors.YELLOW + "$" + (prices[1] - (prices[1] * 30 / 100)) + ConsoleColors.RESET);
                        break;
                    case 3:
                        System.out.println("Now you have to pay: " + ConsoleColors.YELLOW + "$" + (prices[2] - (prices[2] * 30 / 100)) + ConsoleColors.RESET);
                        break;
                    case 4:
                        System.out.println("Now you have to pay: " + ConsoleColors.YELLOW + "$" + (prices[3] - (prices[3] * 30 / 100)) + ConsoleColors.RESET);
                        break;
                    case 6:
                        System.out.println("Now you have to pay: " + ConsoleColors.YELLOW + "$" + (prices[4] - (prices[4] * 30 / 100)) + ConsoleColors.RESET);
                        break;
                }
            } else {
                System.out.println(ConsoleColors.RED + "Your promo code gives you 0% off" + ConsoleColors.RESET);
            }
            do {
                System.out.print("Do you want to buy a phone? yes/no : ");
                wantBuy = sc.nextLine();
            } while (!"no".equals(wantBuy.toLowerCase()) && !"yes".equals(wantBuy.toLowerCase()));

            if (wantBuy.toLowerCase().equals("no")) {
                System.out.println("OK have a nice day!\uD83E\uDD70");
            }
            if (wantBuy.toLowerCase().equals("yes")) {
                System.out.println("Thank you for your purchase!\uD83E\uDD70");
            }
        }
        if (havePromo2.toLowerCase().equals("no")) {
            do {
                System.out.print("Do you want to buy a phone? yes/no : ");
                wantBuy = sc.nextLine();
            } while (!"no".equals(wantBuy.toLowerCase()) && !"yes".equals(wantBuy.toLowerCase()));

            if (wantBuy.toLowerCase().equals("no")) {
                System.out.println("OK have a nice day!\uD83E\uDD70");
            }
            if (wantBuy.toLowerCase().equals("yes")) {
                System.out.println("Thank you for your purchase!\uD83E\uDD70");
            }
        }
    }

    public static class ConsoleColors {
        // Reset
        public static final String RESET = "\033[0m";  // Text Reset
        // Regular Colors
        public static final String BLACK = "\033[0;30m";   // BLACK
        public static final String RED = "\033[0;31m";     // RED
        public static final String GREEN = "\033[0;32m";   // GREEN
        public static final String YELLOW = "\033[0;33m";  // YELLOW
    }
}