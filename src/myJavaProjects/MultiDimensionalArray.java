package myJavaProjects;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {5, 7},
                {4, 8},
                {1, 2}
        };
        nums[1][1] = 67;
        System.out.println(nums[1][1]);
    }

}
