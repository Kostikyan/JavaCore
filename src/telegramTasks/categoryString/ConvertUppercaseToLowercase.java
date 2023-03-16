package telegramTasks.categoryString;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Задача 101: Дана строка. Преобразовать в
// ней все прописные латинские буквы в строчные
public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {

        String input = "Привет, Hello, мир!";
        String regex = "[a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuffer output = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(output, matcher.group().toLowerCase());
        }
        matcher.appendTail(output);
        System.out.println(output.toString()); // выводит "Привет, hello, мир!"

    }
}
