package telegramTasks.categoryIf;

public class IfEqualIfNot {

    public static void main(String[] args) {

        // Задача 56: Даны две переменные целого типа: A и B.
        // Если их значения не равны, то присвоить каждой
        // переменной сумму этих значений, а если равны,
        // то присвоить переменным нулевые значения.
        // Вывести новые значения переменных A и B

        int a = 10, b = 20;
        if (a != b) {
            a += b;
            b = a;
        }
        else if(a == b){
            a = 0;
            b = 0;
        }
        System.out.println(a);
        System.out.println(b);

    }

}
