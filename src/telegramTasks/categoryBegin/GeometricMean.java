package telegramTasks.categoryBegin;

public class GeometricMean {

    public static void main(String[] args) {

        // Задача 43: Даны два неотрицательных числа a и b.
        // Найти их среднее геометрическое,
        // то есть квадратный корень из их произведения

        int a = 81, b = 25; // a,b > 0
        double geometricMean = Math.sqrt(a*b);
        System.out.println("geometric mean: " + geometricMean);

    }

}
