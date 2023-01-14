package telegramTasks.categoryBoolean;

public class NumAOdd {

    public static void main(String[] args) {

      //  Задача 14: Дано целое число A. Проверить истинность
      //  высказывания: «Число A является нечетным»

        int a = 21321;
        boolean checker = (a % 2) == 1;
        if(checker) System.out.println("The number A is odd: " + checker);
        else System.out.println("The number A is odd: " + false);

    }

}
