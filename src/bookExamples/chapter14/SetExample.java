package bookExamples.chapter14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        students.add(new Student("bbbb","zzzz", 32));
        students.add(new Student("cccc","xxxx", 434));
        students.add(new Student("aaaa","yyyy", 2213231));
        students.add(new Student("dddd","nnnn", 521123212));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}