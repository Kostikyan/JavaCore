package homeworks.homework10;

public class BraceChecker {

    private final String text; // text
    private final Stack st = new Stack(); // Stack

    // content of inputtedText pass to the global text
    public BraceChecker(String inputtedText) {
        this.text = inputtedText;
    }

    // method for checking brackets
    public void check() {

        // chars array for text converting
        char[] strAtCharArr = new char[text.length()];

        // index not closed brackets
        int b = 0;

        // adding text chars to array chars
        for (int i = 0; i < text.length(); i++) {

            b++;

            // the content of the global text is converted
            // into a chars and thrown into an array
            strAtCharArr[i] = text.charAt(i);

            // checking, if had close bracket in chars
            char pushedBracket;
            switch (strAtCharArr[i]) {

                // if added chars = open bracket, push to Stack
                case '(':
                case '{':
                case '[':
                    st.push(strAtCharArr[i]);
                    break;

                // if strAtCharArr's element are ')'
                // if strAtCharArr's element are ']'
                // if strAtCharArr's element are '}'
                case ')':
                case '}':
                case ']':

                    char closeBracket = strAtCharArr[i];
                    pushedBracket = st.pop();
                    if ((pushedBracket == '[' && closeBracket == ']')
                            || (pushedBracket == '(' && closeBracket == ')')
                            || (pushedBracket == '{' && closeBracket == '}')) {

                        System.out.println(pushedBracket + " " + closeBracket + " " + true);

                    } else {
                        if (pushedBracket == '[' || pushedBracket == '(' || pushedBracket == '{') {
                            System.out.println("Error: opened " + pushedBracket + " but closed " + closeBracket + " at " + i);
                        } else if (st.isEmpty()) {
                            System.out.println("Error: not opened but closed " + closeBracket + " at " + i);
                        }
                    }
                    break;

                // if another char
                default:
                    break;
            }
        }
        while(!st.isEmpty()){
            b++;
            System.out.println("Error: opened " + st.pop() + " but not closed at " + (b-4));
        }
    }
}


