package telegramTasks.categoryString;

public class CharFrom32To126 {

    public static void main(String[] args) {

        // Задача 76: Дано целое число N
        // (32 ≤ N ≤ 126). Вывести символ
        // с кодом, равным N

        int n = 33;
        if(n >= 32 && n <= 126) {
            System.out.println("Char: " + (char) n);
        }
    }

}
