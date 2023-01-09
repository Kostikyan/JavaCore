package bookExamples.chapter5;

public class Example21 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // выйти из цикла, если значение
                                // переменной i равно 1 0
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");

    }
}
