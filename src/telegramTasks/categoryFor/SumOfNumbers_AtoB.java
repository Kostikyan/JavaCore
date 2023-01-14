package telegramTasks.categoryFor;

public class SumOfNumbers_AtoB {

    public static void main(String[] args) {

        // Задача 54: Даны два целых числа A и B (A < B).
        // Найти сумму всех целых чисел от A до B включительно

        int a = 10, b = 50; // a < b
        int sum = 0;
        for (; a <= b; a++) {
            sum += a;
        }
        System.out.println("\n" + sum);

    }

}
