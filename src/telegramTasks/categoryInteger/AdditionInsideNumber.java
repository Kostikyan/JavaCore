package telegramTasks.categoryInteger;

public class AdditionInsideNumber {

    public static void main(String[] args) {

        // Задача 46: Дано двузначное число.
        // Найти сумму и произведение его цифр

        int twoDigitNumber = 39;
        int multiply = (twoDigitNumber / 10) * (twoDigitNumber % 10);
        int addition = (twoDigitNumber / 10) + (twoDigitNumber % 10);
        System.out.println("multiply: " + multiply);
        System.out.println("addition: " + addition);

    }

}
