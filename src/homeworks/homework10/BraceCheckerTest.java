package homeworks.homework10;

public class BraceCheckerTest {

    public static void main(String[] args) {

        // input text
        homeworks.homework10.BraceChecker bc = new BraceChecker("Hello from [Java} [] {} () }}{}))");

        // checking is correct brackets
        bc.check();

    }

}
