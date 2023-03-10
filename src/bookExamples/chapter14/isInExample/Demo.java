package bookExamples.chapter14.isInExample;

import java.util.Scanner;

public class Demo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T t, V[] v) {
        for (V v1 : v) {
            if (t.equals(v1)) {
                return true;
            }
        }
        return false;
    }

    static Integer[] integers = {1, 2, 3, 4};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        Integer a = sc.nextInt();
        if (isIn(a, integers)) {
            System.out.println(true);
        } else {
            System.out.print("Number " + a + " not found in array {");
            for (int i = 0; i < integers.length; i++) {
                System.out.print(integers[i]);
                if(i != integers.length-1){
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }

}
