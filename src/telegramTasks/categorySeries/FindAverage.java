package telegramTasks.categorySeries;

public class FindAverage {

    public static void main(String[] args) {

        // Задача 69: Даны десять вещественных
        // чисел. Найти их среднее арифметическое

        int[] numArray = {1,6,3,10,60,70,50,500,100,30};
        int sum = 0;
        for (int i : numArray) {
            sum += i;
        }
        int average = sum / numArray.length;
        System.out.println("average: " + average);
    }

}
