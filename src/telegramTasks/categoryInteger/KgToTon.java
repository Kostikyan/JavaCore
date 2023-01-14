package telegramTasks.categoryInteger;

public class KgToTon {

    public static void main(String[] args) {

        // Задача 15:  Дана масса M в килограммах.
        // Используя операцию деления нацело,
        // найти количество полных тонн в ней (1 тонна = 1000 кг)

        int massInKg = 112341;
        int massInTon = massInKg / 1000;
        double massInTon2 = massInTon / 1000d;
        System.out.println("Whole Tons: " + massInTon);
        System.out.println("Tons: " + massInTon2);

    }

}
