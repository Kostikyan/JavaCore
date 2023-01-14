package telegramTasks.categoryInteger;

public class HowManyAinB {

    public static void main(String[] args) {

        // Задача 24: Даны целые положительные числа A и B (A > B).
        // На отрезке длины A размещено максимально возможное
        // количество отрезков длины B (без наложений).
        // Используя операцию деления нацело, найти
        // количество отрезков B, размещенных на отрезке A

        int a = 123;
        int b = 10;
        int countBinA = a / b;
        System.out.println(countBinA);
    }

}
