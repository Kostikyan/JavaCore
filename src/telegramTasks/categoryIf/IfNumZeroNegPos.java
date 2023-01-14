package telegramTasks.categoryIf;

public class IfNumZeroNegPos {

    public static void main(String[] args) {

        //Задача 29: Дано целое число. Если оно является
        // положительным, то прибавить к нему 1;
        // если отрицательным, то вычесть из него 2;
        // если нулевым, то заменить его на 10.
        // Вывести полученное число

        int num = 1;
        if(num > 0) num++;
        else if(num < 0) num-=2;
        else num = 10;
        System.out.println(num);

    }

}
