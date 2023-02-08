package homework.homework5;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int n = 0;

        System.out.print("Start Array: ");
        for (int el: numbers) {
            System.out.print(el + " ");
        }

        System.out.print("\nSort Ascending: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length-i; j++) {
                n++;
                if(numbers[i] > numbers[j]){
                    n = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = n;
                }
            }
        }
        for (int el: numbers) {
            System.out.print(el + " ");
        }

        System.out.print("\nSort descending: ");
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
        for (int el: numbers) {
            System.out.print(el + " ");
        }


    }

}
