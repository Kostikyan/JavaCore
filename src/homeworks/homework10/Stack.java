package homeworks.homework10;

public class Stack {

    private char[] array = new char[10];
    private int size = -1;

    public void push(char value) {
        if (size == array.length) {
            extend();
        }
        array[++size] = value;
    }

    private void extend() {
        char[] newArr = new char[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    public int getSize() {
        return size;
    }

    public char pop() {
        if (size < 0) {
            isEmpty();
            return 0;
        } else {
            return array[size--];
        }
    }
    public boolean isEmpty() {
        return (size < 0);
    }
}
