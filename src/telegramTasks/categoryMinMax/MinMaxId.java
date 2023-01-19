package telegramTasks.categoryMinMax;

import java.util.Collections;
import java.util.Arrays;

public class MinMaxId {

    public static void main(String[] args) {

        // Задача 86: Дано целое число N и
        // набор из N целых чисел. Найти
        // номера первого минимального и
        // последнего максимального элемента
        // из данного набора и вывести
        // их в указанном порядке

        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                System.out.println("min's id: " + i);
            }
            if(numbers[i] == max){
                System.out.println("max's id: " + i);
            }
        }

    }

}
