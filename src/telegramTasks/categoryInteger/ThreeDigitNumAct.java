package telegramTasks.categoryInteger;

public class ThreeDigitNumAct {

    public static void main(String[] args) {

        // Задача 48: Дано трехзначное число.
        // Используя одну операцию деления нацело,
        // вывести первую цифру данного числа (сотни)

        int ThreeDigNum = 345;
        int firstNum = ThreeDigNum/100;
        System.out.println(firstNum);
    }

}
