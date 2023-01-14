package telegramTasks.categoryIf;

public class RedistributeValues {

    public static void main(String[] args) {

        // Задача 53: Даны две переменные вещественного типа: A, B.
        // Перераспределить значения данных переменных так,
        // чтобы в A оказалось меньшее из значений,
        // а в B — большее. Вывести новые значения переменных A и B

        int a = 120, b = 101;
        int c = a;
        if (a > b) {
            a = b;
            b = c;
        }
        System.out.println(a);
        System.out.println(b);

    }

}
