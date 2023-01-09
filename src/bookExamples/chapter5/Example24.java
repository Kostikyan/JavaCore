package bookExamples.chapter5;

public class Example24 {

    public static void main(String[] args) {

        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println(
                            "Предшествует оператру break.");
                    if (t) break second; // выход из блока second
                    System.out.println(
                            "Этот оператор не будет выполняться");
                }
                System.out.println(
                        "Этот оператор не будет выполняться");
            }
            System.out.println(
                    "Этот оператор следует за блоком second.");

        }
    }
}
