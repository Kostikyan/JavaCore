package telegramTasks.categoryProc;

public class FindPowerA234 {

    public static void main(String[] args) {
        powerA234(2);
        powerA234(3);
        powerA234(4);
        powerA234(5);
        powerA234(6);

    }

    public static void powerA234(int A) {
        int b = A * A;
        int c = A * A * A;
        int d = A * A * A * A;
        System.out.println("1: " + A);
        System.out.println("2: " + b);
        System.out.println("3: " + c);
        System.out.println("4: " + d + "\n");
    }
}
