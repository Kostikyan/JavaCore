package homeworks.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ','c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int finalIdStartSpaces = 0;
        int finalIdFinalSpaces = spaceArray.length;

        // находим где заканчиваются пробелы и начинаются символы (с начала)
        for (char value : spaceArray) {
            if (value != ' ') {
                break;
            }
            finalIdStartSpaces++;
        }

        // находим где заканчиваются пробелы и начинаются символы (с конца)
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] != ' ') {
                break;
            }
            finalIdFinalSpaces--;
        }

        // указываем так чтобы конец второго массыва был нашим символом
        char[] result = new char[finalIdFinalSpaces - (finalIdStartSpaces-1)];
        int a = 0;
        for (int i = finalIdStartSpaces; i < finalIdFinalSpaces + 1; i++) {
            result[a] = spaceArray[i];
            a++;
        }

        // выводим результат
        for (Character c : result) {
            System.out.print(c);
        }
    }

}
