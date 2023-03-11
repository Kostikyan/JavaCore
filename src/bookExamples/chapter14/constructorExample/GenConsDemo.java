package bookExamples.chapter14.constructorExample;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons gc1 = new GenCons(100);
        GenCons gc2 = new GenCons(123.5F);
        gc1.showVal();
        gc2.showVal();
    }
}
