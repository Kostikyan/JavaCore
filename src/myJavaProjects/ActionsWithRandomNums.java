package myJavaProjects;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ActionsWithRandomNums {

    public static void main(String[] args) {

        Random rand = new Random();

        long randomNum1 = rand.nextInt(100000);
        long randomNum2 = rand.nextInt(100000);
        System.out.println("ACTIONS WITH RANDOM NUMBERS...");
        System.out.println("random x: " + randomNum1);
        System.out.println("random y: " + randomNum2);
        System.out.print("x + y: ");
        System.out.println(randomNum1 + randomNum2);
        System.out.print("x - y: ");
        System.out.println(randomNum1 - randomNum2);
        System.out.print("x * y: ");
        System.out.println(randomNum1 * randomNum2);

        int scale = 100;
        BigDecimal num1 = new BigDecimal(randomNum1);
        BigDecimal num2 = new BigDecimal(randomNum2);
        if (randomNum2 == 0) {
            System.out.println("x / y: ERROR");
        }
        else {
            System.out.println("x / y: " + num1.divide(num2, scale, RoundingMode.HALF_UP));
        }
    }

}
