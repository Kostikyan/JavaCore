package myJavaProjects;


import java.util.Scanner;

public class AddNumsInArray {
    public static void main(String args[]) {
        int x = 0;
        int[] arr = new int[4];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("введите число: ");
            int value = scan.nextInt();
            arr[i] = value;
            if(i == 3){
                for (i = 0; i < arr.length; i++){
                    System.out.println((x++) + ")" + arr[i]);
                }
            }
        }


    }

}
