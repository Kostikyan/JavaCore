package bookExamples.chapter10;

public class ThrowExample {

    static void myMethod(int a) throws MyCustomException {
        if (a == 100) {
            throw new MyCustomException("a is 100");
        }
        if (a == 200) {
            throw new MyCustomException("a is 200");
        }
        System.out.println(a);
    }

    public static void main(String[] args) throws MyCustomException{
        int num = 200;

        try {
            myMethod(num);
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
        System.out.println("s");

    }

}
