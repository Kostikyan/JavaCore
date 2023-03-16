package telegramTasks.categoryString;

public class CountLatinLetters {
    public static void main(String[] args) {

        // Задача 98: Дана строка. Подсчитать общее количество
        // содержащихся в ней строчных латинских и русских букв

        // code>=65 && code<=122 || code>=128 && code<=175 || code>=224 && code<=241

        String string = "dijsaASDPKOасодЙ123";
        int count = 0;
        char[] stringChar = string.toCharArray();

        for (char c : stringChar) {
            if ((c >= 65 && c <= 122) || (c >= 128 && c <= 175) || (c >= 224 && c <= 241)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
