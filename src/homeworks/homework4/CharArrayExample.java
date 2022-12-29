package homeworks.homework4;

public class CharArrayExample {

    public static void main(String[] args) {

        // chars count in array
        charsCount:
        {
            char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
            char c = 'o';
            int charCount = 0;
            for (int x : chars) {
                if (x == c) {
                    charCount++;
                }
            }
            System.out.println("Count 'o': " + charCount);
        }

        // 2 middle element in array
        middleElements:
        {
            char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
            int firstElementId = (chars2.length - 1) / 2;
            int secondElementId = chars2.length / 2;
            System.out.println("2 Middle chars: " + chars2[firstElementId] + ", " + chars2[secondElementId]);
        }

        // if massive last elements 'l' and 'y' print true
        ifLastElements:
        {
            char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
            int lastElementId = chars3.length - 1;
            int secondLastElId = chars3.length - 2;
            boolean ifLY = true;
            switch (chars3[lastElementId]) {
                case 'y':
                    switch (chars3[secondLastElId]) {
                        case 'l':
                            System.out.println("Last elements l and y?: " + ifLY);
                            break;
                    }
                    break;
                default:
                    System.out.println("Last elements l and y?: " + !ifLY);
            }
        }
        ifNotSpace:
        {
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
            System.out.print("all elements except spaces: ");
            for (char x : text) {
                if (x != ' ') {
                    System.out.print(x);
                }
            }
        }
    }

}
