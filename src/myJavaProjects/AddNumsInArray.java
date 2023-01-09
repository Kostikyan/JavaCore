package myJavaProjects;


import java.util.Arrays;
import java.util.Scanner;

public class AddNumsInArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько элементов вы хотите? (не рекомендуется больше 20-и)");
        int n = scan.nextInt();
        if(n < 0){
            System.err.println("Количество Элементов В Массиве Не Может Быть Отрицательным. //error");
            return;
        }
        if(n == 0){
            System.err.println("Нету Смысла! //error");
            return;
        }
        int x = 0;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("введите " + i + "-е " + "число: ");
            int value = scan.nextInt();
            arr[i] = value;
        }
        System.out.print("Все элементы: ");
        for (int j : arr) {
            System.out.print(x++ + ")" + j);
            if(x != arr.length){
                System.out.print(", ");
            }
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Максимум: " + arr[arr.length-1]);
        System.out.println("Минимум: " + arr[0]);
        System.out.println("Сумма: " + Arrays.stream(arr).sum());

    }

}
