package homeworks.homework6;

public class ArrayUtil {

    /*
        create methods for:
            print all elements in array,
            find max elements in array,
            find min element in array,
            find numerals,
            find not numerals,
            find last element,
            find first element,
            find middle element.
     */

    void allElements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
    }

    void maxNumber(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    void minNumber(int[] nums){
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
    }

    void numeralsInArr(int[] nums){
        int arrLen = nums.length;
        for (int i = 0; i < arrLen; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]);
                if (i != arrLen - 3) {
                    System.out.print(", ");
                }
            }
        }
    }

    void notNumeralsInArr(int[] nums){
        int arrLen = nums.length;
        for (int i = 0; i < arrLen; i++) {
            if (nums[i] % 2 == 1) {
                System.out.print(nums[i]);
                if (i != arrLen - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

    void lastElement(int[] nums){
        int lastElementArr = nums[nums.length-1];
        System.out.println(lastElementArr);
    }

    void firstElement(int[] nums){
        int firstElementArr = nums[0];
        System.out.println(firstElementArr);
    }

    void middleElement(int[] nums){
        if(nums.length % 2 == 0){
            int firstMidElement = nums[nums.length/2];
            int secondMidElement = nums[nums.length/2 - 1];
            System.out.println(firstMidElement + " and " + secondMidElement);
        }
        if(nums.length % 2 == 1){
            int midElement = nums[nums.length/2];
            System.out.println(midElement);
        }
    }

}
