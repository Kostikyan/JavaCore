package myJavaProjects;

import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series (java)");
        System.out.print("Enter а number from 0 to 93: ");
        int n = sc.nextInt();
        System.out.println("Count of numbers: " + n);
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int count) {
        long a = 0l;
        long b = 1l;
        long c = 1l;
        for (int i = 1; i <= count; i++) {
            System.out.print(a);
            if(i != count){
                System.out.print(", ");
            }
            a = b;
            b = c;
            c = a + b;
        }

    }

}
