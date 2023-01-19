package telegramTasks.categoryArray;

public class PowerOf2InArr {

    public static void main(String[] args) {

        // Задача 75: Дано целое число N (> 0).
        // Сформировать и вывести целочисленный
        // массив размера N, содержащий степени
        // двойки от первой до N-й: 2, 4, 8, 16, ...

        int n = 8; // N > 0;
        int[] powerN = new int[n];
        int x = 2;
        for (int i = 0; i < powerN.length; i++) {
            powerN[i] += x;
            x *= 2;
        }
        for (int i : powerN) {
            System.out.print(i + " ");
        }

    }

}
