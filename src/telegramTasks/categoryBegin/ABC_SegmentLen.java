package telegramTasks.categoryBegin;

public class ABC_SegmentLen {

    public static void main(String[] args) {

        // Задача 45: Даны три точки A, B , C на числовой
        // оси. Найти длины отрезков AC и BC и их сумму

        int a = -5, b = 0, c = 20;
        int segmentLength_AC = Math.abs(a - c);
        int segmentLength_BC = Math.abs(b - c);
        int segmentsSum = segmentLength_BC + segmentLength_AC;
        System.out.println("AC: " + segmentLength_AC);
        System.out.println("BC: " + segmentLength_BC);
        System.out.println("Segments Sum: " + segmentsSum);

    }

}
