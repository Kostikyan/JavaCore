package bookExamples.chapter2;

public class Example5 {

    public static void main(String[] args) {

        int x, y;
        y = 20;
        // адресатом этого оператора цикла служит блок кода
        for (x = 0; x < 10; x++) {
            System.out.println("Знaчeниe х:" + x);
            System.out.println("Знaчeниe y:" + y);
            y = y - 2;
        }

    }
}
