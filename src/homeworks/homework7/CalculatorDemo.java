package homeworks.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println("1 + 200 = " + cl.plus(1, 200));
        System.out.println("100 - 20 = " + cl.minus(100, 20));
        System.out.println("10 * 20 = " + cl.multiply(10, 20));
        System.out.println("20 / 40 = " + cl.divide(20, 40));
    }
}
