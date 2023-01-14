package telegramTasks.categoryProc;

public class PowerA3 {

    public static void main(String[] args) {

        // Задача 20: Описать процедуру PowerA3(A, B),
        // вычисляющую третью степень (куб) числа A и
        // возвращающую ее в переменной B (A — входной,
        // B — выходной параметр; оба параметра являются вещественными).
        // С помощью этой процедуры найти третьи степени пяти любых чисел

        double n1 = 3, n2 = 4, n3 = 5, n4 = 6, n5 = 7;
        powerA3(n1, 0);
        powerA3(n2, 0);
        powerA3(n3, 0);
        powerA3(n4, 0);
        powerA3(n5,0);

    }

    public static void powerA3(double a, double b) {
        b = Math.pow(a, 3);
        System.out.println(b);
    }

}
