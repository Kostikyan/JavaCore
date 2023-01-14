package telegramTasks.categoryInteger;

public class ReverseNumber {

    public static void main(String[] args) {

        // Задача 47: Дано двузначное число. Вывести число,
        // полученное при перестановке цифр исходного числа

        int num = 51;
        int firstNum = num / 10;
        int secondNum = num % 10;
        System.out.println(String.valueOf(secondNum) + String.valueOf(firstNum));


    }

}
