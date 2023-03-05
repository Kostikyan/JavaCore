package bookExamples.chapter12;

public class WrapperClassExample {
    public static void main(String[] args) {

        /*
            In Java, the == operator checks if two variables
            reference the same object in memory. In the code
            you provided, a and b are Integer objects with the value of 922.
            However, the Integer class in Java maintains a
            cache of frequently used values between -128 and 127.
            This means that Integer objects with values
            in this range are actually shared among
            multiple variables and are only created once.
            In your case, the value 922 is outside of
            this range, so a and b are actually separate
            Integer objects with the same value. Therefore,
            a == b returns false because they are not the
            same object in memory.
            To compare the values of a and b, you
            can use the equals method instead:
         */

        Integer a = 1231;
        Integer b = 1231;
        boolean c = (b + 0) == (a + 0); // true
        boolean d = b == a; // false
        boolean e = a == (b+0); // true
        System.out.println("Integer a = 1231;\nInteger b = 1231;");
        System.out.println("(b+0) == (a+0): " + c);
        System.out.println("a == (b+0): " + e);
        System.out.println("b == a: " + d);
    }

}
