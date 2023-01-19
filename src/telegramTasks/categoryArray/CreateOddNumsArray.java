package telegramTasks.categoryArray;

public class CreateOddNumsArray {

    public static void main(String[] args) {

        // Задача 72: Дано целое число N (> 0).
        // Сформировать и вывести целочисленный
        // массив размера N, содержащий N первых
        // положительных нечетных чисел: 1, 3, 5, ...

        int n = 10;
        int startOdd = 1;
        int[] oddArray = new int[n];
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = startOdd;
            startOdd += 2;
        }
        for (int i : oddArray) {
            System.out.print(i + " ");
        }
    }

}
