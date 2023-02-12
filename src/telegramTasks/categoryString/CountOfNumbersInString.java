package telegramTasks.categoryString;

public class CountOfNumbersInString {

    public static void main(String[] args) {

        String text = "12jjskdnk234na";
        int countOfNumbers = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '0' || text.charAt(i) == '1'
                    || text.charAt(i) == '2' || text.charAt(i) == '3'
                    || text.charAt(i) == '4' || text.charAt(i) == '5'
                    || text.charAt(i) == '6' || text.charAt(i) == '7'
                    || text.charAt(i) == '8' || text.charAt(i) == '9'){
                countOfNumbers++;
            }
        }
        System.out.println(countOfNumbers);
    }

}
