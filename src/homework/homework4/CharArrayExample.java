package homework.homework4;

public class CharArrayExample {

    public static void main(String[] args) {

        // chars count in array
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int charCount = 0;
        for (int x : chars) {
            if (x == c) {
                charCount++;
            }
        }
        System.out.println("Count 'o': " + charCount);

        // 2 middle element in array
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int firstElementId = (chars2.length - 1) / 2;
        int secondElementId = chars2.length / 2;
        System.out.println("2 Middle chars: " + chars2[firstElementId] + ", " + chars2[secondElementId]);

        // if massive last elements 'l' and 'y' print true
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char lastElementId = chars3[chars3.length - 1];
        char secondLastElId = chars3[chars3.length - 2];
        boolean ifLY = true;
        if (lastElementId == 'y' && secondLastElId == 'l') {
            System.out.println("Last elements l and y?: " + ifLY);
        } else {
            System.out.println("Last elements l and y?: " + !ifLY);
        }

        // if, have space then ignore
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        System.out.print("all elements except spaces: ");
        for (char x : text) {
            if (x != ' ') {
                System.out.print(x);
            }
        }

    }
}