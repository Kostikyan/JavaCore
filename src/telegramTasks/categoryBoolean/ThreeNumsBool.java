package telegramTasks.categoryBoolean;

public class ThreeNumsBool {

    public static void main(String[] args) {

        //Задача 28: Даны три целых числа: A, B, C.
        //Проверить истинность высказывания:
        //«Справедливо двойное неравенство A < B < C»

        int a = 1, b = 2, c = 3;
        boolean checker = a < b && b < c;
        System.out.println("Справедливо двойное неравенство A < B < C: " + checker);

    }

}
