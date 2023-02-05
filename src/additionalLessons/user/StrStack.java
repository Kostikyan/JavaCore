package additionalLessons.user;

public class StrStack {

    private String[] array = new String[4];
    private int size = -1;

    public void push(String value) {
        if (size == array.length) {
            extend();
        }
        array[++size] = value;
    }

    private void extend() {
        String[] newArr = new String[array.length + 4];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    public int getSize() {
        return size;
    }

    public String pop() {
        if (size < 0) {
            isEmpty();
            return "";
        } else {
            return array[size--];
        }
    }
    public boolean isEmpty() {
        return (size < 0);
    }

}
