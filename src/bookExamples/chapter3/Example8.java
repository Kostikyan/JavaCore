package bookExamples.chapter3;

public class Example8 {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println(
                "\nПреобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("i и Ь" + i + " " + b);
        System.out.println(
                "\nПреобразование типа douЫe в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);
        System.out.println(
                "\nПреобразование типа douЫe в тип b y t e . " ) ;
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);
    }

}
