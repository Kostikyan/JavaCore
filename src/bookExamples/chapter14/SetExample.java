package bookExamples.chapter14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Book> nameSet = new TreeSet<>();
        nameSet.add(new Book("asd", 2));
        nameSet.add(new Book("assd", 3));
        nameSet.add(new Book("asdd", 4));
        nameSet.add(new Book("aasd", 5));

        for (Book s : nameSet) {
            System.out.println(s);
        }
    }
}