package telegramTasks.categoryArray;

public class ArfProgress {

    public static void main(String[] args) {

        // Задача 78: Дано целое число N (> 1),
        // а также число A и разность D арифметической
        // прогрессии. Сформировать и вывести массив
        // размера N, содержащий N первых чисел данной
        // прогрессии: A, A + D, A + 2*D, A + 3*D, ...

        int n = 10;
        if(n > 1){
            int a = 3;
            int d = 5;
            int[] arfP = new int[n];
            for (int i = 0; i < arfP.length; i++) {
                arfP[i] += a + i * d;
            }
            for (int i : arfP) {
                System.out.println(i + " ");
            }
        }

    }

}
