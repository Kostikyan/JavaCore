package additionalLessons;

public class CreateArray {

    public static void main(String[] args) {
        //Arrays:
        int[] startArr = {1,3,88,13,25,9,-5};
        int[] finalArr = new int[startArr.length + 2];
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = startArr[i];
            if(i == startArr.length - 1){
                break;
            }
        }
        // find max and min in array:
        int max = startArr[0];
        int min = startArr[0];
        for (int i = 1; i < startArr.length; i++) {
            if(startArr[i] < max){
                max = startArr[i];
            }
            if(startArr[i] > min){
                min = startArr[i];
            }
        }
        // startArrays sum:
        int sum = 0;
        for (int i = 0; i < startArr.length; i++) {
            sum += startArr[i];
        }

        // adding numbers in finalArray:
        finalArr[finalArr.length-1] = max - min;
        finalArr[finalArr.length-2] = sum;
        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]);
        }
    }

}
