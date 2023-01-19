package telegramTasks.categoryBoolean;

public class OneNumbersOdd {

    public static void main(String[] args) {

        // Задача 64: Даны два целых числа: A, B.
        // Проверить истинность высказывания:
        // «Ровно одно из чисел A и B нечетное»

        int a = 20, b = 23;
        boolean aXorBOdd = a % 2 == 1 ^ b % 2 == 1;
        if(aXorBOdd){
            System.out.println("Ровно одно из чисел A и B нечетное: " + aXorBOdd);
        }else{
            System.out.println("Ровно одно из чисел A и B нечетное: " + aXorBOdd);
        }
    }

}
