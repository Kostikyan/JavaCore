import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int k = scan.nextInt();
        for (int i = 0; i <= k; i++) {
            for (int j = i; j <= k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
