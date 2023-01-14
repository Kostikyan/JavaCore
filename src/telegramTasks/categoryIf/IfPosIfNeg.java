package telegramTasks.categoryIf;

public class IfPosIfNeg {

    public static void main(String[] args) {

       // Задача 13: Дано целое число. Если оно является
       // положительным, то прибавить к нему 1; в противном
       // случае вычесть из него 2. Вывести полученное число

        int n = 12; // целое число
        if(n > 0) n += 1;
        else n -= 2;

        System.out.println(n);

    }

}
