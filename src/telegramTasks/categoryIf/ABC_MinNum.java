package telegramTasks.categoryIf;

public class ABC_MinNum {

    public static void main(String[] args) {

        //Задача 59: Даны три числа.
        // Найти наименьшее из них

        int a = 100, b = 20, c = 30;
        if(a < b && a < c){
            System.out.println("min: " + a);
        }else if(b < a && b < c){
            System.out.println("min: " + b);
        }else if(c < a && c < b){
            System.out.println("min: " + c);
        }
    }

}
