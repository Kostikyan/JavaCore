package telegramTasks.categoryIf;

public class StartMaxFinalMin {

    public static void main(String[] args) {

        // Задача 50: Даны два числа. Вывести
        // вначале большее, а затем меньшее из них

        int a = 10, b = 100;
        boolean maxVariant1 = a > b;
        boolean maxVariant2 = b > a;
        if(maxVariant1){
            System.out.println("1) " + a);
            System.out.println("2) " + b);
        }
        else if(maxVariant2){
            System.out.println("1) " + b);
            System.out.println("2) " + a);
        }

    }

}
