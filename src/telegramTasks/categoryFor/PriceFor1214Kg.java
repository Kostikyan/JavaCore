package telegramTasks.categoryFor;

public class PriceFor1214Kg {

    public static void main(String[] args) {

        // Задача 37: Дано вещественное число — цена 1 кг конфет.
        // Вывести стоимость 1.2, 1.4, ..., 2 кг конфет

        for (double i = 1.2; i <= 2; i+=0.2) {
            double price = 100;
            price *= i;
            System.out.println(price);
        }

    }

}
