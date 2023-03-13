package myJavaProjects;

import java.util.Map;
import java.util.TreeMap;
public class TreeMapNullPointerException {
    /**
     *
     * {@param NullPointerException}
     *
     * <p>
     * After adding items to TreeMap
     * I write this code:
     * <p>
     * {@code
     *     boolean a = testMap.containsKey(null);
     *     boolean b = testMap.containsValue(null);
     * }
     * But for some reason it gives a NullPointerException
     *
     * <p>
     * The same error also occurs after deleting
     * {@code (String::compareTo)} In the parameter area of {@param TreeMap}
     * in this section of the code:
     *     {@see alwaysFalse block,
     *           Line: 28}
     *
     */
    public static void main(String[] args) {
        Map<String, String> testMap = new TreeMap<>(String::compareTo);

        NullPointerException e = new NullPointerException("I don't know why this error is triggered");

        alwaysFalse:
        {
            System.out.println("Before put:");
            boolean a = testMap.containsKey(null);
            boolean b = testMap.containsValue(null);

            System.out.print("contains key(null): ");
            System.out.println(a);

            System.out.print("contains value(null): ");
            System.out.println(b);
        }

        testMap.put("094", "FirstPerson");
        testMap.put("077", "SecondPerson");
        testMap.put("098", "ThirdPerson");

        System.out.println("\nAfter put:");

        boolean a = testMap.containsKey("094");
        boolean b = testMap.containsValue("Vahe");
        System.out.print("contains key(094), value(Vahe): ");
        System.out.printf("%s, %s", a, b);
        System.out.println();

        System.out.println("contains key(null), value(null): " + e);

        System.out.println(testMap);
        System.out.println(testMap.values());
        System.out.println(testMap.keySet());
    }
}
