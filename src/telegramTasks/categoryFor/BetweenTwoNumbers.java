package telegramTasks.categoryFor;

public class BetweenTwoNumbers {

    public static void main(String[] args) {

        //Задача 12: Даны два целых числа A и B (A < B).
        // Вывести в порядке возрастания все целые числа,
        // расположенные между A и B (включая сами числа A и B),
        // а также количество N этих чисел

        int a = 30;
        int b = 40;
        int countBetween = 0;
        program(a, b, countBetween);
        System.out.print("\n" + (countBetween-1));

    }

    public static void program(int x, int y, int countBetween) {
        for (int i = x; i < y + 1; i++) {
            countBetween++;
            System.out.print(x++);
            if (i != y) {
                System.out.print(", ");
            }
        }
    }
}
