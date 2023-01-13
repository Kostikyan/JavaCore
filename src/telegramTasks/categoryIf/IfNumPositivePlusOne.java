package telegramTasks.categoryIf;

public class IfNumPositivePlusOne {

    public static void main(String[] args) {

        //Задача 6: Дано целое число. Если оно является положительным,
        //то прибавить к нему 1; в противном случае
        //не изменять его. Вывести полученное число

        int num = 1;
        boolean isPositive = num > 0;
        if(isPositive) num += 1;
        else num = num;
        System.out.println(num);

    }

}
