package superTest;

public class Demo {
    public static void main(String[] args) {
        Student nigger = new Student("Kampot", "Axmedovich");
        StudentColor black;
        black = new StudentColor(nigger.getName(), nigger.getSurname(), "Black");
        System.out.println(black.getName());
        System.out.println(black.getSurname());
        System.out.println(black.color);
    }
}
