package myJavaProjects;

import java.util.Random;
import java.util.Scanner;

public class numbersGame {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static int countOfLessons = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the numbers game!");
        System.out.println("Select difficulty!");
        System.out.println("    1) Hard");
        System.out.println("    2) Normal");
        System.out.println("    3) Easy");
        System.out.print("Enter Num (1-3): ");
        int chosenNum = sc.nextInt();
        if(chosenNum > 3 || chosenNum < 1) return;
        System.out.println("How many equations do you want? ");
        if(chosenNum == 1) ifHard();
        if(chosenNum == 2) ifNormal();
        if(chosenNum == 3) ifEasy();
    }

    public static void ifHard(){
        countOfLessons = sc.nextInt();
        System.out.println("Good, Let's Start!");
        for (int i = 0; i < countOfLessons; i++) {
            int firstNum = rand.nextInt(150);
            int secondNum = rand.nextInt(150);
            System.out.print(firstNum + " + " + secondNum + " = ");
            int checkEquality = sc.nextInt();
            if(checkEquality != firstNum + secondNum){
                System.out.println("Game Over!");
                return;
            }
        }
        System.out.println("Awesome!");
    }

    public static void ifNormal(){
        countOfLessons = sc.nextInt();
        System.out.println("Good, Let's Start!");
        for (int i = 0; i < countOfLessons; i++) {
            int firstNum = rand.nextInt(100);
            int secondNum = rand.nextInt(100);
            System.out.print(firstNum + " + " + secondNum + " = ");
            int checkEquality = sc.nextInt();
            if(checkEquality != firstNum + secondNum){
                System.out.println("Game Over!");
                return;
            }
        }
        System.out.println("Awesome!");
    }

    public static void ifEasy(){
        countOfLessons = sc.nextInt();
        System.out.println("Good, Let's Start!");
        for (int i = 0; i < countOfLessons; i++) {
            int firstNum = rand.nextInt(50);
            int secondNum = rand.nextInt(50);
            System.out.print(firstNum + " + " + secondNum + " = ");
            int checkEquality = sc.nextInt();
            if(checkEquality != firstNum + secondNum){
                System.out.println("Game Over!");
                return;
            }
        }
        System.out.println("Awesome!");
    }

}
