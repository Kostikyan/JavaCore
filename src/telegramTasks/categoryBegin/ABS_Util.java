package telegramTasks.categoryBegin;

public class ABS_Util {
    public static void main(String[] args) {

        double a = -29, b = 40;
        double sum = Math.abs(a) + Math.abs(b);
        double difference = Math.abs(a) - Math.abs(b);
        double product = Math.abs(a) * Math.abs(b);
        double quotient = Math.abs(a) / Math.abs(b);
        System.out.println(sum + ", " + difference + ", " + product + ", " + quotient);

    }
}
