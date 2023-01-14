package telegramTasks.categoryProc;
import java.util.Scanner;
public class SumOfAllNums {

    public static void main(String[] args) {

        //Задача 40: Описать функцию SumRange(A, B) целого типа,
        // находящую сумму всех целых чисел от A до B включительно
        // (A и B — целые). Если A > B, то функция возвращает 0.
        // С помощью этой функции найти суммы чисел от A до B и от B до C,
        // если даны числа A, B, C

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.println(sumRange(a, b) + sumRange(b, c));

    }
    public static int sumRange(int a, int b){
        if(a > b){
            return 0;
        }
        int sum = 0;
        for (; a <= b; a++) {
            sum += a;
        }
        return sum;
    }
}
