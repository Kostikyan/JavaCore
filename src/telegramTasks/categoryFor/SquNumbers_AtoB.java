package telegramTasks.categoryFor;

public class SquNumbers_AtoB {

    public static void main(String[] args) {

        // Задача 60: Даны два целых числа A и B (A < B).
        // Найти сумму квадратов всех целых
        // чисел от A до B включительно

        int a = 1;
        int b = 4;
        int sum = 0;
        for (; a <= b; a++) {
            sum += a*a;
        }
        System.out.println("sum: " + sum);

    }

}
