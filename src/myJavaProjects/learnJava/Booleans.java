package myJavaProjects.learnJava;

public class Booleans {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = (a ^ b) == (a != b);
        boolean d = c &= !b || a;

    }

}
