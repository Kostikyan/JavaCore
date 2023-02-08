package homework.homework2;


public class FIgurePaiter2 {

    public static void main(String[] args) {
        // FIGURE PAINTER 1
        System.out.println("FIRST FIGURE: ");
        for (int i = 4; i > 0; i--) {
            for (int j = 7; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // FIGURE PAINTER 2
        System.out.print("SECOND FIGURE: ");
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
