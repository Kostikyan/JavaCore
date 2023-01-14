package telegramTasks.categoryBoolean;

public class AorB_Odd {

    public static void main(String[] args) {

        // Задача 61: Даны два целых числа: A, B.
        // Проверить истинность высказывания:
        // «Хотя бы одно из чисел A и B нечетное»

        int a = 1121, b = 20;
        boolean oddChecker = a % 2 == 1 || b % 2 == 1;
        if (oddChecker) {
            System.out.println("Хотя бы одно из чисел A и B нечетное: " + oddChecker);
        }else{
            System.out.println("Хотя бы одно из чисел A и B нечетное: " + oddChecker);
        }

    }

}
