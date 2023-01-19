package telegramTasks.categorySeries;

public class ProductOfNums {

    public static void main(String[] args) {

        // Задача 66: Даны десять вещественных
        // чисел. Найти их произведение

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        long sum = 1;
        for (int number : numbers) {
            sum *= number;
        }
        System.out.println(sum);

    }

}
