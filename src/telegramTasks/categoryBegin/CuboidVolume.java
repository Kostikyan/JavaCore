package telegramTasks.categoryBegin;

public class CuboidVolume {

    public static void main(String[] args) {

        // Задача 26: Даны длины ребер a, b, c
        // прямоугольного параллелепипеда. Найти его объем
        // V=a*b*c и площадь поверхности S=2*(a*b+b*c+a*c)

        double a = 12, b = 3, c = 2;
        double volume = a * b * c;
        double surfaceArea = 2 * (a*b + b*c + a*c);
        System.out.println("volume: " + volume);
        System.out.println("surface area: " + surfaceArea);
    }

}
