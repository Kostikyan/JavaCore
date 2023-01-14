package telegramTasks.categoryBoolean;

public class NumbersDip {

    public static void main(String[] args) {

       // Задача 25: Даны два целых числа: A, B.
       // Проверить истинность высказывания:
       // «Справедливы неравенства A ≥ 0 или B < –2»

        int a = 0;
        int b = -21;
        boolean checker = a >= 0 && b < -2;
        System.out.println("Справедливы неравенства: " + checker);

    }

}
