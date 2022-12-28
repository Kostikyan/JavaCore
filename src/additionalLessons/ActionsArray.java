package additionalLessons;

public class ActionsArray {

    public static void main(String[] args) {

        int numArr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int numSum = 0;
        int x = 0;
        for (int i = 0; i < numArr.length; i++) {
            numSum += numArr[i];
        }
        int sumHalf = numSum/2;
        numSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            numSum += numArr[i];
            if(numSum == sumHalf){
                x = i;
                System.out.println(i);
            }
            for (int j = numArr.length; j > i; j--) {
                System.out.println(j);
            }
        }


    }

}
