package homeworks.homework1;

public class IfForExample {

    public static void main(String[] args) {
        int a, b;
        a = 50;
        b = 80;

        // max int
        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }

        // all numbers from 50 to 80
        int i;
        if (a > b) {
            for (i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ints a and b to char
        char inta = (char) a;
        char intb = (char) b;
        System.out.println("a: " + inta);
        System.out.println("b: " + intb);

        // if a = b
        if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("a is not equal to b");
        }
    }

}
