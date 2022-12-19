package myJavaProjects;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(/*num of elements*/);
        numbers.add(51);
        numbers.add(54);
        numbers.add(1, 45);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
        numbers.clear();

        for(Integer el: numbers){
            System.out.println(el);
        }

        // LinkedList
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Hello, World!");
        strings.add("Hello World!");
        strings.add("Hello World");

        for (String el: strings){
            System.out.println(el);
        }
    }

}
