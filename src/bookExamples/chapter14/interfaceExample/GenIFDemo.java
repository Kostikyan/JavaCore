package bookExamples.chapter14.interfaceExample;

public class GenIFDemo {
    public static void main(String[] args) {

        Integer[] inums = {3,6,8,9,32};
        Character[] chars = {'a', 'b', 'c', 'd'};
        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chars);
        System.out.println(iob.max());
        System.out.println(iob.min());
        System.out.println(cob.min());
        System.out.println(cob.max());

    }
}
