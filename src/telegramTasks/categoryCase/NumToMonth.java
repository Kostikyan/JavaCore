package telegramTasks.categoryCase;

public class NumToMonth {

    public static void main(String[] args) {

        //Задача 33: Дан номер месяца — целое число в диапазоне 1–12
        // (1 — январь, 2 — февраль и т. д.). Вывести название
        // соответствующего времени года («зима», «весна», «лето», «осень»)

        int n = 12; // 1-12
        switch (n) {
            case 1:
            case 12:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
        }

    }

}
