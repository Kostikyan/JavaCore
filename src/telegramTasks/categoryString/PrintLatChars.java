package telegramTasks.categoryString;

public class PrintLatChars {

    public static void main(String[] args) {

        // Задача 82: Дано целое число N (1 ≤ N ≤ 26).
        // Вывести N первых прописных (то есть заглавных)
        // букв латинского алфавита

        int n = 1;
        if(n >= 1 && n <= 26){
            n -= 1;
            for (int i = 0; i < 26; i++) {
                System.out.print((char)(65+(n++)) + " ");
            }
        }

    }

}
