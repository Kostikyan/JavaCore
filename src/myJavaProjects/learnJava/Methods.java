package myJavaProjects.learnJava;

public class Methods {

    public static void main(String[] args) {

        int[] nums1 = new int[] {5, 6, 8};
        int total = expArray(nums1);
        System.out.println("(first array) Result: " + total);

        int[] nums2 = new int[] {5, 6, 8, 3, 445, 213, 1293};
        int total2 = expArray(nums2);
        System.out.println("(second array) Result: " + total2);
    }
    public static int expArray(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }

}
