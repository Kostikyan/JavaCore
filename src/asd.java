import java.util.ArrayList;

public class asd {
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>(213);

        // es 4 hat add-ic heto size-y 4 kdarna
        n.add("a");
        n.add("a");
        n.add("a");
        n.add("a");

        // u stex nor 4-y ktuylatrvi ogtagorcel
        n.add(4, "sad");

        System.out.println(n);
    }
}
