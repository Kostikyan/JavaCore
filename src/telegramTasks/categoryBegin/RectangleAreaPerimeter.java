package telegramTasks.categoryBegin;

public class RectangleAreaPerimeter {

    public static void main(String[] args) {
        //Задача 16: Даны стороны прямоугольника a и b.
        //Найти его площадь S=a*b и периметр P=2*(a+b)
        int a = 13, b = 19;
        areaPerimeter(a, b);
    }

    public static void areaPerimeter(int x, int y) {
        int S = x * y;
        int P = 2 * (x + y);
        System.out.println("Area: " + S);
        System.out.println("Perimeter: " + P);
    }

}
