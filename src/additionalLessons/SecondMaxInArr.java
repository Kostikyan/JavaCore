package additionalLessons;

public class SecondMaxInArr {

    public static void main(String[] args) {

        int[] num = new int[]{113, 272, 153, 344, 551, 0, 123, 51, 45};

        int max = -2_147_483_648;
        int secondMax = -2_147_483_648;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                secondMax = max;
                max = num[i];
            }

            if (num[i] < max && num[i] > secondMax) {
                secondMax = num[i];
            }
        }
        System.out.println(secondMax);
    }


}

