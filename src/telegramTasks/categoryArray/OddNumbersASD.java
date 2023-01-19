package telegramTasks.categoryArray;

public class OddNumbersASD {

    public static void main(String[] args) {

        // Задача 84: Дан целочисленный массив
        // размера N. Вывести все содержащиеся
        // в данном массиве нечетные числа в
        // порядке возрастания их индексов,
        // а также их количество K

        int[] intsArr = {1, 2, 100, 302, 103, 15, 7, 9, 11, 23};
        int oddCount = 0;
        for (int j : intsArr) {
            if (j % 2 == 1) {
                oddCount++;
                System.out.print(j + " ");
            }
        }
        System.out.println("\nodd count: " + oddCount);

    }

}
