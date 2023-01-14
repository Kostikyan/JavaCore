package telegramTasks.categoryFor;

public class PriceFor01Kg {

    public static void main(String[] args) {

        // Задача 36: Дано вещественное число — цена 1 кг конфет.
        // Вывести стоимость 0.1, 0.2, ..., 1 кг конфет

        for (double i = 0.1d; i <= 1; i+=0.1d) {
            double price = 150d;
            price *= i;
            System.out.println(price);
        }

    }

}
