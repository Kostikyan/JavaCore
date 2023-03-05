package bookExamples.chapter14;

public class StorageDemo {
    public static void main(String[] args) {
        Storage<Student> students = new Storage<>();
        Storage<Book> books = new Storage<>();

        // Auto create Objects array
        Storage objects = new Storage<>();
        objects.add("a");
        objects.add(123);

        Student student = new Student("poxos", "poxosyan", 12);
        Book book = new Book("girq", "213213");
        books.add(book);
        students.add(student);

        Student byIndex = students.getByIndex(0);
        System.out.println(byIndex);

    }
}
