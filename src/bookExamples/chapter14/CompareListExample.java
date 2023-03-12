package bookExamples.chapter14;

import java.util.*;

public class CompareListExample {

    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Queue<String> a = new LinkedList<>();
        Deque<String> b = new LinkedList<>();
        List<String> c = new LinkedList<>();
        Collection<String> d = new LinkedList<>();
        Iterable<String> f = new LinkedList<>();
        LinkedList<String> g = new LinkedList<>();

        studentsList.add(new Student("bbbb","zzzz", 32));
        studentsList.add(new Student("cccc","xxxx", 434));
        studentsList.add(new Student("aaaa","yyyy", 2213231));
        studentsList.add(new Student("dddd","nnnn", 521123212));
        studentsList.sort(comparator);
        System.out.println(studentsList);

    }

}
