package additionalLessons;

import java.util.Scanner;
public class ActionsNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numArr = {10,23,14,21,13,1,2,4,3,5,6,7,8,9,123,11,294};
        System.out.print("All numbers: ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
            if(i != numArr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("\nEnter Number: ");
        int anyNum = sc.nextInt();
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i+1; j < numArr.length; j++) {
                if(numArr[i] + numArr[j] == anyNum){
                    System.out.println(numArr[i] + " + " +numArr[j] + " = " + anyNum);
                }
            }
        }
    }

}
