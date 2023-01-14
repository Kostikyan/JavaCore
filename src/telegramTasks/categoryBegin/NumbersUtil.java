package telegramTasks.categoryBegin;

public class NumbersUtil {

    public static void main(String[] args) {
        // Задача 44: Даны два ненулевых числа.
        // Найти сумму, разность,
        // произведение и частное их квадратов

        int a, b; // (-inf;0)U(0;+inf)
        a = 10;
        b = 20;
        int sum = a + b;
        int productOfNumbers = a * b;
        int difference = Math.abs(a - b);
        int quotientOfSquares = a * a - b * b;
        System.out.println("sum: " + sum);
        System.out.println("product of numbers: " + productOfNumbers);
        System.out.println("difference: " + difference);
        System.out.println("quotient of squares: " + quotientOfSquares);

    }
}