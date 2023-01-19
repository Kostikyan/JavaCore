package homeworks.homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynArr = new DynamicArray();

        // add elements in dynamic array
        for (int i = 0; i <= 23; i++) {
            dynArr.add(i);
        }

        // get element with index y
        System.out.println(dynArr.getByIndex(5));

        //print all elements
        dynArr.print();

    }

}
