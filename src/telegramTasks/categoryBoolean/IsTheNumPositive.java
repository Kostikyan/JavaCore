package telegramTasks.categoryBoolean;

import java.util.Scanner;

public class IsTheNumPositive {

    public static void main(String[] args) {

        /* Задача 4: Дано целое число A. Проверить истинность
        высказывания: «Число A является положительным» */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and the program will check if it is positive");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Is the number positive?: " + true);
        } else if (num == 0) {
            System.out.println("Is the number positive?: " + "error)");
        } else {
            System.out.println("Is the number positive?: " + false);
        }

    }

}
