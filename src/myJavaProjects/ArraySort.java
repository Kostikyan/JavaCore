package myJavaProjects;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {

        Integer[] numArr = {1, 3, 123, 42, 125, 43, -1, -235, 12321, 65748};
        int arrLen = numArr.length;

        normalArray:
        {
            int i = 0;
            System.out.print("Original Array: ");
            for (int x : numArr) {
                i++;
                System.out.print(x);
                if (i != arrLen) {
                    System.out.print(", ");
                }
            }
        }

        sortedArray:
        {
            int n = 0;
            Arrays.sort(numArr);
            System.out.print("\nSorted Array: ");
            for (int x : numArr) {
                n++;
                System.out.print(x);
                if (n != arrLen) {
                    System.out.print(", ");
                }
            }
        }

        revSortedArray:
        {
            int n = 0;
            Arrays.sort(numArr, Collections.reverseOrder());
            System.out.print("\nReverse Sorted Array: ");
            for (int x : numArr) {
                n++;
                System.out.print(x);
                if (n != arrLen) {
                    System.out.print(", ");
                }
            }
        }
        maxAndMinNumInArray: {
            Arrays.sort(numArr);
            System.out.println("\nMax num in Array: " + numArr[numArr.length-1]);
            System.out.println("Min num in Array: " + numArr[0]);
        }
    }

}
