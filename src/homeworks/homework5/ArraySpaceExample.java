package homeworks.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ','c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startCharId = 0;
        int finalCharId = spaceArray.length;

        // находим где заканчиваются пробелы и начинаются символы (с начала)
        for (char value : spaceArray) {
            if (value != ' ') {
                break;
            }
            startCharId++;
        }

        // находим где заканчиваются пробелы и начинаются символы (с конца)
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] != ' ') {
                break;
            }
            finalCharId--;
        }

        // указываем так чтобы конец второго массыва был нашим символом
        char[] result = new char[finalCharId - (startCharId-1)];
        int a = 0;
        for (int i = startCharId; i < finalCharId + 1; i++) {
            result[a] = spaceArray[i];
            a++;
        }

        // выводим результат
        for (Character c : result) {
            System.out.print(c);
        }
    }

}
