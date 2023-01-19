package telegramTasks.categoryMinMax;

import java.util.Arrays;

public class MinMaxInArr {

    public static void main(String[] args) {

        // Задача 71: Дано целое число N и набор из N чисел.
        // Найти минимальный и максимальный из элементов
        // данного набора и вывести их в указанном порядке

        int[] numArray = {10,24,23,44,23,64,57,68,79,-5};
        Arrays.sort(numArray);
        System.out.println(numArray[0] + " & " + numArray[numArray.length-1]);

    }

}
