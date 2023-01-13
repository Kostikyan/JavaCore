package telegramTasks.categoryBegin;
import java.util.Scanner;
public class SquarePerimeterArea {

    public static void main(String[] args) {

        // Задача 1: Дана сторона квадрата a. Найти его периметр P=4*a
        // Задача 2: Дана сторона квадрата a. Найти его площадь S=a^2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square.");
        int squareSide = sc.nextInt();
        int squarePerimeter = squareSide * 4;
        int squareArea = squareSide * squareSide;
        System.out.println("\nSquare Perimeter (P): " + squarePerimeter);
        System.out.println("Square Area (S): " + squareArea);

    }

}
