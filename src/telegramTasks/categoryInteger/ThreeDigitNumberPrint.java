package telegramTasks.categoryInteger;

// Задача 100: Дано трехзначное число. Вывести
// вначале его последнюю цифру (единицы),
// а затем — его среднюю цифру (десятки)

public class ThreeDigitNumberPrint {

    public static void main(String[] args) {

        int threeDigitNumber = 432;
        String intString = Integer.toString(threeDigitNumber);
        System.out.println(intString.charAt(2));
        System.out.println(intString.charAt(1));

    }

}
