package telegramTasks.categoryWhile;

public class LenOfSegment {

    public static void main(String[] args) {

        //Задача 10: Даны положительные числа A и B (A > B).
        //На отрезке длины A размещено максимально возможное
        //количество отрезков длины B (без наложений).
        //Не используя операции умножения и деления,
        //найти длину незанятой части отрезка A

        double A = 100d;
        double B = 23d;
        double segment = A;
        while (segment > 0) {
            segment -= B;
            if (segment - B < 0) {
                break;
            }
        }
        System.out.println(segment);

    }

}
