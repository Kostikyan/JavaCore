package telegramTasks.categoryArray;

public class ArrayReverseSort {

    public static void main(String[] args) {

        // Задача 81: Дан массив размера N.
        // Вывести его элементы в обратном порядке

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                n++;
                if(numbers[i] < numbers[j]){
                    n = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = n;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
