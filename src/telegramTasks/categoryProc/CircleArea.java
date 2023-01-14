package telegramTasks.categoryProc;

public class CircleArea {

    public static void main(String[] args) {
        // Задача 21: Описать функцию CircleS(R) вещественного типа,
        // находящую площадь круга радиуса R (R — вещественное).
        // С помощью этой функции найти площади трех кругов с любыми радиусами.
        // Площадь круга радиуса R вычисляется по формуле S=π*R^2.
        // В качестве значения π использовать 3.14

        double r1 = 12, r2 = 123, r3 = 4.5d, r4 = 23, r5 = 12.9d;
        CircleS(r1);
        CircleS(r2);
        CircleS(r3);
        CircleS(r4);
        CircleS(r5);

    }

    public static void CircleS(double r) {
        double area = 3.14d * (r * r);
        System.out.println("if r = " + r + " . area: " + area);
    }
}
