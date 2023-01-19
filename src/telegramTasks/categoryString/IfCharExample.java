package telegramTasks.categoryString;

public class IfCharExample {

    public static void main(String[] args) {

        // Задача 88: Дан символ C, изображающий
        // цифру или букву (латинскую или русскую)
        // Если C изображает цифру, то вывести строку
        // «digit», если латинскую букву — вывести
        // строку «lat», если русскую — вывести строку «rus»

        char c = '3';
        int idOfChar = c;
        if (idOfChar >= 48 && idOfChar <= 57) {
            System.out.println("digit");
        }
        else if (idOfChar >= 65 && idOfChar <= 122) {
            System.out.println("lat");
        }
        else if (idOfChar >= 128 && idOfChar <= 175 || idOfChar >= 224 && idOfChar <= 241) {
            System.out.println("rus");
        }
    }

}
