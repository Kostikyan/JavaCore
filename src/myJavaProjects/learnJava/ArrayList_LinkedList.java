package myJavaProjects.learnJava;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(/*num of elements*/);
        numbers.add(51);
        numbers.add(54);
        numbers.add(45);
        numbers.add(32);

        System.out.println("ARRAY LIST");
        System.out.print("size: ");
        System.out.println(numbers.size());
        System.out.print("second num: ");
        System.out.println(numbers.get(1));
        System.out.print("digit index 54: ");
        System.out.println(numbers.indexOf(54));
        System.out.println();

        System.out.print("all nums in ArrayList: ");
        for (Integer el : numbers) {

            String x = el + " ";
            System.out.print(x);

        }
        System.out.println("\n");
        System.out.println("LINKED LIST");
        numbers.clear();


        // LinkedList
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Hello, World!");
        strings.add("Hello World!");
        strings.add("Hello World");
        System.out.println("all strings: ");
        for (String el : strings) {
            System.out.println(el);
        }
    }

}
