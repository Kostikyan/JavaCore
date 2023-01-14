package telegramTasks.categoryFor;

public class FindProductOfNums {

    public static void main(String[] args) {

        // Задача 57: Даны два целых числа A и B (A < B).
        // Найти произведение всех целых
        // чисел от A до B включительно

        long a = 10, b = 20;
        long sum = a;
        for (; a <= b; a++) {
            sum *= a;
        }
        System.out.println(sum);
    }

}
