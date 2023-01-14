package telegramTasks.categoryProc;

public class CoordinateQuarterNumber {

    public static void main(String[] args) {

        //Задача 52:  Описать функцию Quarter(x, y) целого типа,
        // определяющую номер координатной четверти,
        // в которой находится точка с ненулевыми вещественными
        // координатами (x , y). С помощью этой функции найти
        // номера координатных четвертей для
        // трех точек с данными ненулевыми координатами

        quarter(1, -2);
        quarter(-1 , -10);
        quarter(10, 2);

    }

    public static void quarter(int x, int y) {
        if (x < 0 && y < 0) {
            System.out.println("third quarter");
        }
        if (x < 0 && y > 0) {
            System.out.println("second quarter");
        }
        if (x > 0 && y > 0) {
            System.out.println("first quarter");
        }
        if (x > 0 && y < 0) {
            System.out.println("fourth quarter");
        }
    }
}
