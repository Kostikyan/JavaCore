package telegramTasks.categoryFor;

public class TempMaxToMin {

    public static void main(String[] args) {

        // Задача 51: Даны два целых числа A и B (A < B).
        // Вывести в порядке убывания все целые числа,
        // расположенные между A и B
        // (не включая числа A и B),
        // а также количество N этих чисел

        int temp = 0;
        int a = 10, b = 40; // a < b
        for (b = b-1; a < b; b--) {
            temp++;
            System.out.print(b + " ");
        }
        System.out.println("\nCount: " + temp);

    }

}
