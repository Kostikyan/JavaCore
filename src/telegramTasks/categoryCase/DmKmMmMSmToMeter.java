package telegramTasks.categoryCase;

public class DmKmMmMSmToMeter {

    public static void main(String[] args) {

        // Задача 70: Единицы длины пронумерованы следующим образом:
        // 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
        // Дан номер единицы длины (целое число в диапазоне 1–5)
        // и длина отрезка в этих единицах (вещественное число).
        // Найти длину отрезка в метрах

        byte unitsFound = 1; // 1 - 5
        double segmentLength = 260;
        switch (unitsFound){
            case 1:
                System.out.println(segmentLength +
                        " decimeter to meter: " + segmentLength/10);
                break;
            case 2:
                System.out.println(segmentLength +
                        " kilometer to meter: " + segmentLength*1000);
                break;
            case 3:
                System.out.println(segmentLength +
                        " meter to meter: " + segmentLength);
                break;
            case 4:
                System.out.println(segmentLength +
                        " millimeter to meter: " + segmentLength*0.001);
                break;
            case 5:
                System.out.println(segmentLength +
                        " centimeter to meter: " + segmentLength*0.01);
        }

    }

}
