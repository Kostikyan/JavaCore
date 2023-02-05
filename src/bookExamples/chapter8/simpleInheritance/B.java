package bookExamples.chapter8.simpleInheritance;

public class B extends A {
    int k;
    void showK() {
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + k + j: " + (i+j+k));
    }
}
