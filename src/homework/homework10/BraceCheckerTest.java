package homework.homework10;

public class BraceCheckerTest {

    public static void main(String[] args) {

        // input text
        BraceChecker bc = new BraceChecker("Hello from [Java} [] {} () }}{}))(((");

        // checking is correct brackets
        bc.check();

    }

}
