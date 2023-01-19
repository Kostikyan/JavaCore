package telegramTasks.categoryCase;

public class DaysInMonth {

    public static void main(String[] args) {

        // Задача 67: Дан номер месяца — целое число
        // в диапазоне 1–12
        // (1 — январь, 2 — февраль и т. д.).
        // Определить количество дней в этом месяце
        // для не високосного года

        int monthId = 2; // monthId -> [1; 12]
        switch (monthId){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9:
            case 11:
                System.out.println("30 days");
                break;
        }
    }

}
