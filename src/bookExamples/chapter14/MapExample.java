package bookExamples.chapter14;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

/*
        {@code true}
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("poxos@mail.com", new Student("Poxos", "dls", 2213321));
        studentMap.put("petros@mail.com", new Student("Petros", "asf", 2312));
        Student student = studentMap.get("petros@mail.com");
        System.out.println(student);
        System.out.println(studentMap);
*/

        Map<Company, Integer> companySizeMap = new TreeMap<>(new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Company company = new Company("A1", "Company1");
        Company company2 = new Company("A2", "Company2");
        Company company3 = new Company("A3", "Company3");

        companySizeMap.put(company, 20);
        companySizeMap.put(company3, 220);
        companySizeMap.put(company2, 23);

        System.out.println(companySizeMap.get(company));

        /*
            *   {@code true}
            *   Set<Company> companies = companySizeMap.keySet();
            *   Collection<Integer> values = companySizeMap.values();
        */

        Set<Map.Entry<Company, Integer>> entries = companySizeMap.entrySet();

        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }

    }
}