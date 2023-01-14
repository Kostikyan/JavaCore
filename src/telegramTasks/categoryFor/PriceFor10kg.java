package telegramTasks.categoryFor;

public class PriceFor10kg {

    public static void main(String[] args) {

        //Задача 35: Дано вещественное число — цена 1 кг конфет.
        //Вывести стоимость 1, 2, ..., 10 кг конфет

        for (int i = 1; i < 11; i++) {
            double price = 120;
            price *= i;
            System.out.println("for " + i + "kg: " + price);
        }

    }

}
