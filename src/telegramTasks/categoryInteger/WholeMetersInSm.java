package telegramTasks.categoryInteger;
import java.util.Scanner;
public class WholeMetersInSm {

    public static void main(String[] args) {

/*      Задача 3: Дано расстояние L в сантиметрах.
        Используя операцию деления нацело,
        найти количество полных метров в нем (1 метр = 100 см) */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many centimeters do you want to convert to meters");
        int distanceInSM = sc.nextInt();
        int wholeMeters = distanceInSM / 100;
        double convertMeters = distanceInSM / 100d;
        System.out.println("\nWhole Meters: " + wholeMeters);
        System.out.print("Meters: " + convertMeters);

    }

}
