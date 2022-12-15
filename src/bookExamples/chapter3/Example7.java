package bookExamples.chapter3;

public class Example7 {

    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная у инициализируется при
            // каждом вхождении в блок кода
            System.out.println("y равно: " + y);
            // здесь всегда выводится значение -1
            y = 100;
            System.out.println("у теперь равно: " + y);
        }

    }
}
