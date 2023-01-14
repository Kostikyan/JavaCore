package telegramTasks.categoryIf;

public class ABC_2MaxSum {

    public static void main(String[] args) {

        // Задача 62: Даны три числа. Найти
        // сумму двух наибольших из них

        int a = 1022, b = 2032, c =310;
        if(c > b && b > a || b > c && c > a){
            System.out.println("sum: " + (c + b));
        }
        if(a > b && b > c || b > a && a > c){
            System.out.println("sum: " + (a + b));
        }
        if(c > a && a > b || a > c && c > b){
            System.out.println("sum: " + (c + a));
        }

    }

}