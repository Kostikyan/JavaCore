package telegramTasks.categoryWhile;

public class IfPowerOf3 {

    public static void main(String[] args) {

        // Задача 38: Дано целое число N (> 0). Если оно является
        // степенью числа 3, то вывести True, если не является — вывести False

        int n = 81;
        int x = 3;
        while (true) {
            x *= 3;
            if(x == n){
                System.out.println(true);
                break;
            }
            if(x > n){
                System.out.println(false);
                break;
            }
        }

    }
}

