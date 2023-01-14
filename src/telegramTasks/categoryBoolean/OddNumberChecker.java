package telegramTasks.categoryBoolean;

public class OddNumberChecker {

    public static void main(String[] args) {

        // Задача 58: Даны два целых числа: A, B.
        // Проверить истинность высказывания:
        // «Каждое из чисел A и B нечетное»

        int a = 13;
        int b = 21;
        if (a % 2 == 1 && b % 2 == 1) {
            System.out.println("Каждое из чисел A и B нечетное: " + true);
        }else{
            System.out.println("Каждое из чисел A и B нечетное: " + false);
        }
    }

}
