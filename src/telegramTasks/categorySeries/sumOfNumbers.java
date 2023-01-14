package telegramTasks.categorySeries;

public class sumOfNumbers {

    public static void main(String[] args) {

        //Задача 19: Даны десять вещественных
        //чисел. Найти их сумму

        double[] numArr = {1d, -5d, 6.54d, 123d, 213231d, -213.23d, 7d, 0.1d, 21321d, 19d};
        int sum = 0;
        for (double v : numArr) {
            sum += v;
        }
        System.out.println(sum);

    }

}
