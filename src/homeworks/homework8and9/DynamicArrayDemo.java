package homeworks.homework8and9;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynArr = new DynamicArray();

        // add elements in dynamic array
        for (int i = 0; i <= 23; i++) {
            dynArr.add(i);
        }

        // get element by index
        System.out.println(dynArr.getByIndex(5));

        // delete element by index
        dynArr.deleteByIndex(20);

        // value with index 15 -> 50
        dynArr.set(15, 50);

        // add value without removal
        dynArr.add(10, 30);

        //print all elements
        dynArr.print();

        // get index by value
        System.out.println(dynArr.getIndexByValue(20));

        // is there VALUE in the array? true/false
        System.out.println("is there " + 2 + " in the array? : " + dynArr.exists(2));

    }

}
