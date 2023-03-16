package telegramTasks.categoryInteger;

public class IntMemberAdd {
    public static void main(String[] args) {

        // Задача 97: Дано двузначное число.
        // Найти сумму и произведение его цифр

        int numInt = 57;
        String number = Integer.toString(numInt);
        int first = Integer.parseInt(String.valueOf(number.charAt(0)));
        int second = Integer.parseInt(String.valueOf(number.charAt(1)));
        int sum = first + second;
        System.out.println(sum);

    }
}
