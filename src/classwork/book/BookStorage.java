package classwork.book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Book[] newArr = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    public void searchByName(String kw){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if(book.getTitle().contains(kw)){
                System.out.println(book);
                found = true;
            }
        }
        if(!found){
            System.out.println("Book with " + kw + " not found!!!");
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}