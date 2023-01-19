package telegramTasks.categoryMinMax;

public class StMaxLastMinInArr {

    public static void main(String[] args) {

        // Задача 89: Дано целое число N и набор из
        // N целых чисел. Найти номера первого
        // максимального и последнего минимального
        // элемента из данного набора и вывести
        // их в указанном порядке

        int[] ints = {1,100,23,41,533,124,54,32,12,23};
        int min = ints[0], max = ints[0];
        int idOfMin = 0, idOfMax = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i]<min) {
                min = ints[i];
                idOfMin = i;
            }
            if (ints[i]>max) {
                max = ints[i];
                idOfMax = i;
            }
        }
        System.out.println("min index: " + idOfMin);
        System.out.println("max index: " + idOfMax);

    }

}
