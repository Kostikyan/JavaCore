package homework.homework2;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = new int[]{11,27,53,34,51,0,123,51,45};
        int n = 1; // any number (not 0)
        for (int i = 0; i < numbers.length; i++) {
            int ifzero = numbers[i] / n;
            if(ifzero != 0){
                System.out.println(numbers[i]);
            }

        }

    }

}
