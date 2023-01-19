package telegramTasks.categoryString;

public class CharPlusOne {

    public static void main(String[] args) {

        // Задача 79: Дан символ C. Вывести два символа,
        // первый из которых предшествует символу
        // C в кодовой таблице, а второй следует за символом C

        char c = 34;
        System.out.print("Char 1: " + c +
                "\nChar 2: " + (char)(c + 1));

    }

}
