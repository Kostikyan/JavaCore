package telegramTasks.categoryCase;

public class DaysOfWeek {

    public static void main(String[] args) {
        //Задача 8: Дано целое число в диапазоне 1–7.
        //Вывести строку — название дня недели, соответствующее
        //данному числу (1 — «понедельник», 2 — «вторник» и т. д.)

        int weekDay = 2;
        checker(weekDay);
    }

    public static void checker(int i) {
        switch (i){
            case 1:
                System.out.println(i + ") Monday");
                break;
            case 2:
                System.out.println(i + ") Tuesday");
                break;
            case 3:
                System.out.println(i + ") Wednesday");
                break;
            case 4:
                System.out.println(i + ") Thursday");
                break;
            case 5:
                System.out.println(i + ") Friday");
                break;
            case 6:
                System.out.println(i + ") Saturday");
                break;
            case 7:
                System.out.println(i + ") Sunday");
                break;
            default:
                System.out.println(i + ") error");
        }
    }
}
