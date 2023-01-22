package homeworks.homework8and9;

public class DynamicArray {

    // array and size
    private int[] array = new int[10];
    private int size = 0;

    // for void add(index value)
    private boolean haveDeletedElement = false;

    // method for adding elements in array
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    // add element without removal
    public void add(int index, int value) {
        if (index >= 0 || index < size) {
            array[index++] = array[index];
            if (!haveDeletedElement) size++;
            array[index] = value;
        } else {
            System.out.println("error: no index " + index);
        }
    }

    // if elements count 10+
    private void extend() {
        int[] newArr = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    // set value
    public void set(int index, int value) {
        if (index >= 0 || index < size) {
            array[index] = value;
        } else {
            System.out.println("error: no index " + index);
        }
    }

    // get by index, delete by index, get index by value
    public int getByIndex(int index) {
        if (index < size || index >= 0) {
            return array[index];
        } else {
            return -1;
        }
    }
    public void deleteByIndex(int index) {
        if (index < size || index >= 0) {
            int[] anotherArray = new int[array.length - 1];
            for (int i = 0, k = 0; i < array.length; i++) {
                if (i == index) {
                    continue;
                }
                anotherArray[k++] = array[i];
            }
            array = anotherArray;
            size--;
            haveDeletedElement = true;
        } else {
            System.out.println("error: no element at index " + index);
        }
    }
    public int getIndexByValue(int value) {
        int j = 0;
        int k = -1;
        for (int i : array) {
            j++;
            if (i == value) {
                k = j;
                return k;
            }
        }
        return k;
    }

    // have value in arr true/false
    public boolean exists(int value) {
        boolean exists = false;
        for (int i : array) {
            if (i == value) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    // print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
