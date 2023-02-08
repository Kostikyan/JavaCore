package classwork;

public class StringExample {

    public static void main(String[] args) {

        String name = "Poxos Poxosyan";

        System.out.println("name: " + name);
        System.out.println("length: " + name.length());
        System.out.println("trim length: " + name.trim().length());
        System.out.println("Start \"Poxos\" ?: " + name.startsWith("Poxos"));
        System.out.println("Finish \"yan\" ?: " + name.endsWith("yan"));
        System.out.println("Have \"os\" ?: " + name.contains("os"));
        System.out.println("uppercase: " + name.toUpperCase());
        System.out.println("lowercase: " + name.toLowerCase());
        System.out.println("trim: " + name.trim());
        System.out.println("substring(6): " + name.substring(6));
        System.out.println("substring(6, 11): " + name.substring(6, 11));

        System.out.println("split: ");
        String[] names = name.split(" ");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.print("String to Chars Array: {");
        char[] chars = name.toCharArray(); // or charAt()
        for (char aChar : chars) {
            if (aChar == 'n') {
                System.out.print("'" + aChar + "'");
                break;
            }
            System.out.print("'" + aChar + "'" + ", ");
        }
        System.out.println("}");

    }

}
