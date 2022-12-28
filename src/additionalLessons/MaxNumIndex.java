package additionalLessons;

public class MaxNumIndex {

    public static void main(String[] args) {

        int[] numArr = {24, 556, 82, 101, 3352, 226, 171, 616, 102, 310};
        int max = numArr[0];
        int maxNumId = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
                maxNumId = i;
            }
        }
        System.out.println("index: " + maxNumId);
        System.out.println("max: " + max);
    }
}
