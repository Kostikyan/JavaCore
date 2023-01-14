package telegramTasks.categoryBegin;

import java.sql.SQLOutput;

public class CubeVolume {

    public static void main(String[] args) {

        //Задача 23: Дана длина ребра куба a. Найти объем
        //куба V=a^3 и площадь его поверхности S=6*a^2

        int a = 3;
        double volume = Math.pow(a, 3);
        double area = 6 * a * a;

        System.out.println("volume: " + volume);
        System.out.println("area: " + area);
    }

}
