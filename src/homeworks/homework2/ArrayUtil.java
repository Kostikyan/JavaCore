package homeworks.homework2;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] nums = {24, 556, 82, 101, 3352, 226, 171, 616, 102, 310};

        // all elements
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + ")" + nums[i]);
        }

        // max num in nums
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];

            }
        }
        System.out.println("max: " + max);

        // min num in nums
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("min: " + min);


    }
}
