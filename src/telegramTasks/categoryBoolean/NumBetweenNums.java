package telegramTasks.categoryBoolean;

public class NumBetweenNums {

    public static void main(String[] args) {

        //Задача 49: Даны три целых числа: A, B, C.
        // Проверить истинность высказывания:
        // «Число B находится между числами A и C»

        int a = 10, b = 20, c = 30;
        boolean NumBBetweenAC = a < b && b < c;
        System.out.println("Number B is between numbers A and C: "
                + NumBBetweenAC);

    }

}
