package telegramTasks.categoryBoolean;

public class NumAEven {

    public static void main(String[] args) {

        //Задача 18: Дано целое число A. Проверить истинность
        //высказывания: «Число A является четным»

        int a = 1221;
        boolean aChecker = a % 2 == 0; // true
        if(aChecker) System.out.println("The number A is even: " + aChecker); // тут true
        else System.out.println("The number A is even: " + aChecker); // тут false

    }

}
