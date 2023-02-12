package telegramTasks.categoryString;

public class LatinCharsInString {
    public static void main(String[] args) {

        String text = "asdfg2345ADFGH";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char textCh = text.charAt(i);
            if(textCh >= 65 && textCh <= 122){
                count++;
            }
        }
        System.out.println(count);

    }
}
