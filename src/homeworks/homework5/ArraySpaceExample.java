package homeworks.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ','c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startCharId = 0;
        int finalCharId = spaceArray.length - 1;

        // находим где заканчиваются пробелы и начинаются символы (с начала)
        while(spaceArray[startCharId] == ' '){
            startCharId++;
        }

        // находим где заканчиваются пробелы и начинаются символы (с конца)
        while(spaceArray[finalCharId] == ' '){
            finalCharId--;
        }

        // указываем так чтобы конец второго массыва был нашим символом
        char[] result = new char[(finalCharId - startCharId) + 1];
        int a = 0;
        for (int i = startCharId; i < finalCharId; i++) {
            result[a++] = spaceArray[i];
        }

        // выводим результат
        for (char c : result) {
            System.out.print(c);
        }
    }

}
