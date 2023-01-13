package telegramTasks.categoryIf;

public class PosNegCount {

    static int positiveCount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;

    public static void main(String[] args) {
        //Задача 7: Даны три целых числа.
        // Найти количество положительных и количество
        // отрицательных чисел в исходном наборе

        int A = 1; checker(A);
        int B = -2; checker(B);
        int C = -5; checker(C);

        System.out.println("positive count: " + positiveCount);
        System.out.println("negative count: " + negativeCount);
        System.out.println("zero count: " + zeroCount);
    }

    public static void checker(int pnz) {
        if(pnz>0) positiveCount++;
        else if(pnz==0) zeroCount++;
        else negativeCount++;
    }

}
