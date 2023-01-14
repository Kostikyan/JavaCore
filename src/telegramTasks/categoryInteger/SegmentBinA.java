package telegramTasks.categoryInteger;

public class SegmentBinA {

    public static void main(String[] args) {

        // Задача 27: Даны целые положительные числа A и B (A > B).
        // На отрезке длины A размещено максимально возможное
        // количество отрезков длины B (без наложений).
        // Используя операцию взятия остатка от деления нацело,
        // найти длину незанятой части отрезка A

        double A = 10023;
        double B = 23.1;
        double segment = A % B;
        System.out.println(segment);

    }

}
