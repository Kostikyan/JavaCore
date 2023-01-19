package telegramTasks.categoryString;

public class LatCharsReverse {

    public static void main(String[] args) {

        // Задача 85: Дано целое число N (1 ≤ N ≤ 26).
        // Вывести N последних строчных (то есть маленьких)
        // букв латинского алфавита в
        // обратном порядке (начиная с буквы «z»)

        int n = 1;
        if(n >= 1 && n <= 26){
            n -= 1;
            for (int i = 0; i < 26; i++) {
                System.out.println((char)(122 - (n++)));
            }
        }

    }

}
