package additionalLessons.user;

public class DynamicStrArray {

    // array and size
    private String[] array = new String[10];
    private int size = 0;

    // method for adding elements in array
    public void add(String value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    // if elements count 10+
    private void extend() {
        String[] newArr = new String[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    // get by index, delete by index, get index by value
    public String getByIndex(int index) {
        if (index < size || index >= 0) {
            return array[index];
        } else {
            return "";
        }
    }

    // print all elements
    public void printD() {
        int userNumber = 1;
        int printData = 0;
        for (double i = 0; i < size; i+=4) {
            System.out.println("User Number " + userNumber);
            System.out.println("name: " + array[0 + printData]);
            System.out.println("surname: " + array[1 + printData]);
            System.out.println("password: " + array[2 + printData]);
            System.out.println("email: " + array[3 + printData]);
            System.out.println();
            if(i % 4 == 0){
                userNumber++;
                printData+=4;
            }
        }
    }


}
