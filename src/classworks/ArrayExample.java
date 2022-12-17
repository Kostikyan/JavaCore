package classworks;

public class ArrayExample {

    public static void main(String[] args) {
        int[] nums = {33,44,-2,6612,77342};
        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i] + " ");
        }

        int[] myArray = new int[10];
        //add nums to array
        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }
        //print nums from array
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }

    }

}
