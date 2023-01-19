package telegramTasks.categoryIf;

public class FindMiddleNum_ABC {

    public static void main(String[] args) {

        // Задача 65: Даны три числа. Найти среднее
        // из них (то есть число, расположенное
        // между наименьшим и наибольшим)

        int a = 10, b = 70, c = 11;
        if (a < b && a > c || a > b && a < c) {
            System.out.println("Num A");
        } else if (b < a && b > c || b > a && b < c) {
            System.out.println("Num B");
        } else if (c < a && b < c || c > a && c < b) {
            System.out.println("Num C");
        }
    }

}
