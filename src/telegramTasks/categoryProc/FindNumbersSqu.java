package telegramTasks.categoryProc;

public class FindNumbersSqu {

    public static void main(String[] args) {

        // Задача 55: Описать функцию IsSquare(K)
        // логического типа, возвращающую True,
        // если целый параметр K (> 0) является
        // квадратом некоторого целого числа, и
        // False в противном случае. С ее помощью
        // найти количество квадратов в наборе из
        // 10 целых положительных чисел

        int[] nums = {3,5,5,5,2,1,10,11,26,6};
        isSquare(25, nums);

    }

    public static void isSquare(int k, int[] array) {
        int countOfNum = 0;
        for (int j : array) {
            if (j * j == k) {
                System.out.println(true);
                break;
            }
        }
        for (int j : array) {
            if (j * j == k) {
                countOfNum++;
            }
        }
        System.out.println(countOfNum);
    }
}
