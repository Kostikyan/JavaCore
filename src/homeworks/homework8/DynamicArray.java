package homeworks.homework8;

public class DynamicArray {

    // array and size
    private int[] array = new int[10];
    private int size = 0;

    // method for adding elements in array
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    // method if elements count 10+
    private void extend() {
        int[] newArr = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    // method for get by index
    public int getByIndex(int index) {
        if (index < size || index >= 0) {
            return array[index];
        } else {
            return -1;
        }
    }

    // method for print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
