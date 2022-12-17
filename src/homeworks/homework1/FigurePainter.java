package homeworks.homework1;

public class FigurePainter {

    public static void main(String[] args) {
        int i, j;

        System.out.print("Figure 1:");
        // figure 1
        for (i = 0; i < 6; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Figure 2:\n");
        //figure 2
        for (i = 0; i < 5; i++) {
            for (j = 2 * (4 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Figure 3:\n");
        //figure 3
        for(i = 5; i >= 1; i--) {
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}