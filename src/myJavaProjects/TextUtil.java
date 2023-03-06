package myJavaProjects;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TextUtil {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        // Разбиваем текст на слова
        String[] words = text.split("[^a-zA-Zа-яА-Я]+");

        // Количество слов в тексте
        int numWords = words.length;
        System.out.println("Количество слов в тексте: " + numWords);

        // Количество символов в тексте
        int numChars = text.length();
        System.out.println("Количество символов в тексте: " + numChars);

        // Количество уникальных слов в тексте
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        int numUniqueWords = uniqueWords.size();
        System.out.println("Количество уникальных слов в тексте: " + numUniqueWords);

        // Самое часто встречающееся слово в тексте и количество его вхождений
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        String mostCommonWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                mostCommonWord = word;
                maxCount = count;
            }
        }
        System.out.println("Самое часто встречающееся слово в тексте: " + mostCommonWord);
        System.out.println("Количество раз, которое это слово встречается в тексте: " + maxCount);
    }

}