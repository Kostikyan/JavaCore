package telegramTasks.categoryIf;

public class IfPosCount {

    public static void main(String[] args) {

        //Задача 30: Даны три целых числа. Найти
        //количество положительных чисел в исходном наборе
        int a = 2, b = 3, c = 1;
        int posCount = 0;
        if(a > 0) posCount++;
        if(b > 0) posCount++;
        if(c > 0) posCount++;
        System.out.println(posCount);

    }

}
