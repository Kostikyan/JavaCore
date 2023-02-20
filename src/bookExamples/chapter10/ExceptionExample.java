package bookExamples.chapter10;

public class ExceptionExample {
    public static void main(String[] args) {
        String numStr = "2k";
        int a = Integer.parseInt(numStr);
        System.out.println(a);
    }
}
