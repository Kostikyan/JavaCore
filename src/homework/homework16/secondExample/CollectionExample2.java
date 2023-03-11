package homework.homework16.secondExample;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collections;

public class CollectionExample2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // add 5 names to nameList
        while(nameList.size() < 5){
            System.out.print("input name: ");
            String name = sc.nextLine();
            nameList.add(name);
        }

        // print only unique names
        Set<String> nameLinkedHashSet = new LinkedHashSet<>(nameList);
        System.out.println(nameLinkedHashSet);

        // add 10 names
        nameList.add("a"); nameList.add("ba"); nameList.add("bc");
        nameList.add("t"); nameList.add("g"); nameList.add("ds");
        nameList.add("avb"); nameList.add("bb"); nameList.add("bi");
        nameList.add("op");

        // print ALL names (SORTED)
        Collections.sort(nameList);
        System.out.println(nameList);
    }

}
