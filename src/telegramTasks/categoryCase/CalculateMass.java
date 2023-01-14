package telegramTasks.categoryCase;

public class CalculateMass {

    public static void main(String[] args) {

        //Задача 34: Единицы массы пронумерованы следующим образом:
        // 1 — килограмм, 2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер.
        // Дан номер единицы массы (целое число в диапазоне 1–5)
        // и масса тела в этих единицах (вещественное число).
        // Найти массу тела в килограммах

        int n = 5; //1-5
        long mass = 10120;
        if (n == 1) {
            mass /= 1;
        } else if (n == 2) {
            mass = (mass / 1000) / 1000;
        } else if (n == 3) {
            mass /= 1000;
        } else if (n == 4) {
            mass *= 1000;
        } else if (n == 5) {
            mass *= 100;
        } else {
            System.out.println("wrong number");
        }
        System.out.println(mass);
    }

}
