package homework.homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        int[] nums = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3, 1};
        ArrayUtil au = new ArrayUtil();

        // print all elements:
        System.out.print("All Elements: {");
            au.allElements(nums);
        System.out.println("};");

        // print all numerals:
        System.out.print("Numerals: {");
            au.numeralsInArr(nums);
        System.out.println("};");

        // print all not numerals:
        System.out.print("Not Numerals: {");
            au.notNumeralsInArr(nums);
        System.out.println("};");

        // print max and min numbers:
        System.out.print("Max: ");
            au.maxNumber(nums);
        System.out.print("Min: ");
            au.minNumber(nums);

        // print first, last and middle element(s);
        System.out.print("First element: ");
        au.firstElement(nums);
        System.out.print("Last element: ");
        au.lastElement(nums);
        System.out.print("Middle element(s): ");
        au.middleElement(nums);

    }

}
