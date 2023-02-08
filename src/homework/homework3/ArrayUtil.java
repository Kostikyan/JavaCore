package homework.homework3;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numArr = {254, 5256, 812, 1301, 3352, 226, 2171, 3110, 201};
        int arrLen = numArr.length;
        int numeralsCount = 0;
        int notnumeralsCount = 0;
        int arrSum = 0;
        int arrFirstElement = numArr[0];
        int arrLastElement = numArr[arrLen - 1];
        int arrMiddleElement = numArr[arrLen / 2];
        // all elements
        System.out.print("All Elements: ");
        for (int i = 0; i < numArr.length; i++) {
            arrSum += numArr[i];
            System.out.print(i + ")" + numArr[i]);
            if (i != arrLen - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // All numerals not numerals
        // numerals and not numerals count
        System.out.print("numerals: ");
        for (int i = 0; i < arrLen; i++) {
            if (numArr[i] % 2 == 0) {
                numeralsCount++; //check if numeral +1 to numeralsCount
                System.out.print(numArr[i]);
                if (i != arrLen - 2) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        System.out.print("not numerals: ");
        for (int i = 0; i < arrLen; i++) {
            if (numArr[i] % 2 == 1) {
                System.out.print(numArr[i]);
                if (i != arrLen - 1) {
                    System.out.print(", ");
                }
                notnumeralsCount ++; //check if not numeral +1 to numeralsCount
            }
        }
        System.out.println();
        System.out.print("numerals count: " + numeralsCount + "\n");
        System.out.println("not numerals count: " + notnumeralsCount);
        System.out.println("sum of array elements: " + arrSum);
        System.out.println("the arithmetic mean of the numbers: " + (double) arrSum/arrLen);
        System.out.println("last element: " + arrLastElement);
        System.out.println("First element: " + arrFirstElement);
        System.out.println("Middle element: " + arrMiddleElement);
    }

}
