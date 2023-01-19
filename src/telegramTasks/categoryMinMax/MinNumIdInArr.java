package telegramTasks.categoryMinMax;

public class MinNumIdInArr {

    public static void main(String[] args) {

        // Задача 80: Дано целое число N и набор из
        // N чисел. Найти номер минимального
        // элемента из данного набора

        int[] minId = {4, 2, 100, 200, 300, 10, 1, 30, 40, 50};
        int min = minId[0];
        for (int i = 1; i < minId.length; i++) {
            if (minId[i] < min) {
                min = minId[i];
            }
        }
        System.out.println("min: " + min);
        for (int i = 0; i < minId.length; i++) {
            if (minId[i] == min) {
                System.out.println("id: " + i);
            }
        }
    }

}
