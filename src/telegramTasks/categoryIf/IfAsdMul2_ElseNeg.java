package telegramTasks.categoryIf;

public class IfAsdMul2_ElseNeg {

    public static void main(String[] args) {

        // Задача 68: Даны три переменные вещественного типа:
        // A, B, C. Если их значения упорядочены по возрастанию,
        // то удвоить их; в противном случае заменить значение
        // каждой переменной на противоположное.
        // Вывести новые значения переменных A, B, C

        int a = 10, b = 20, c = 30;
        if(a < b && b < c){
            a *= 2;
            b *= 2;
            c *= 2;
        }else{
            a *= -1;
            b *= -1;
            c *= -1;
        }
        System.out.println("a: " + a + "\n"
                + "b: " + b + "\n"
                + "c: " + c + "\n"
        );

    }

}
