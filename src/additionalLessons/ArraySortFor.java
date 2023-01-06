package additionalLessons;

public class ArraySortFor {

    public static void main(String[] args) {

        int[] numArr = {23,14,63,223,14,34,-1,-22,-5,-6,-23};
        int n = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                n++;
                if(numArr[i] > numArr[j]){
                    n = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = n;
                }
            }
        }
        for (int el: numArr) {
            System.out.print(el + " ");
        }
    }

}
