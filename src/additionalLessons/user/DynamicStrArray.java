package additionalLessons.user;

public class DynamicStrArray {

    // array and size
    private String[] array = new String[10];
    private int size = 0;

    // for void add(index value)
    private boolean haveDeletedElement = false;

    // method for adding elements in array
    public void add(String value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    // add element without removal
    public void add(int index, String value) {
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
        String[] newArr = new String[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    // set value
    public void set(int index, String value) {
        if (index >= 0 || index < size) {
            array[index] = value;
        } else {
            System.out.println("error: no index " + index);
        }
    }

    // get by index, delete by index, get index by value
    public String getByIndex(int index) {
        if (index < size || index >= 0) {
            return array[index];
        } else {
            return "";
        }
    }
    public void deleteByIndex(int index) {
        if (index < size || index >= 0) {
            String[] anotherArray = new String[array.length - 1];
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
    public int getIndexByValue(String value) {
        int j = 0;
        int k = -1;
        for (String i : array) {
            j++;
            if (i.equals(value)) {
                k = j;
                return k;
            }
        }
        return k;
    }

    // have value in arr true/false
    public boolean exists(String value) {
        boolean exists = false;
        for (String i : array) {
            if (i.equals(value)) {
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
