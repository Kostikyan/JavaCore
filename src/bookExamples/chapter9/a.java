package bookExamples.chapter9;

public class a implements MyInterface,MyAnotherInterface{
    @Override
    public void method1() {
        System.out.println("a");
    }

    @Override
    public void method2() {
        System.out.println('b');
    }
}
