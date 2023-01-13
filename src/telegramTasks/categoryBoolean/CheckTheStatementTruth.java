package telegramTasks.categoryBoolean;

public class CheckTheStatementTruth {

    public static void main(String[] args) {

        // Задача 5: Даны два целых числа: A, B. Проверить истинность
        // высказывания: «Справедливы неравенства A > 2 и B ≤ 3»

        double a = 2.6d;
        double b = 3d;
        boolean isBetween = (a > 2) && (b <= 3);
        System.out.println("a > 2 and b <= 3?: " + isBetween);

    }

}
