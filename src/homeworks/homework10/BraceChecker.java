package homeworks.homework10;

public class BraceChecker {

    private String text; // text
    private Stack st = new Stack(); // Stack

    // content of inputtedText pass to the global text
    public BraceChecker(String inputtedText) { this.text = inputtedText; }

    // method for checking brackets
    public void check() {

        // chars array for text converting
        char[] strAtCharArr = new char[text.length()];

        // adding text chars to array chars
        for (int i = 0; i < text.length(); i++) {

            // the content of the global text is converted
            // into a chars and thrown into an array
            strAtCharArr[i] = text.charAt(i);

            // if added chars = open bracket, push to Stack
            if (strAtCharArr[i] == '(' || strAtCharArr[i] == '{' || strAtCharArr[i] == '[') {
                st.push(strAtCharArr[i]);
            }

            // checking, if had close bracket in chars
            char pushedBracket;
            switch (strAtCharArr[i]) {

                // if strAtCharArr's element are ')'
                case ')':
                    pushedBracket = st.pop();
                    if (pushedBracket == '[') {
                        System.out.println("Error: opened [ but closed ) at " + i);
                    } else if (pushedBracket == '{') {
                        System.out.println("Error: opened { but closed ) at " + i);
                    } else if(pushedBracket == '(') {
                        System.out.println("() " + true);
                    } else if(st.isEmpty()){
                        System.out.println("Error: not opened but closed ) at " + i);
                    }
                    break;

                // if strAtCharArr's element are ']'
                case ']':
                    pushedBracket = st.pop();
                    if (pushedBracket == '(') {
                        System.out.println("Error: opened ( but closed ] at " + i);
                    } else if (pushedBracket == '{') {
                        System.out.println("Error: opened { but closed ] at " + i);
                    } else if (pushedBracket == '[') {
                        System.out.println("[] " + true);
                    } else if(st.isEmpty()){
                        System.out.println("Error: not opened but closed ] at " + i);
                    }
                    break;

                // if strAtCharArr's element are '}'
                case '}':
                    pushedBracket = st.pop();
                    if (pushedBracket == '[') {
                        System.out.println("Error: opened [ but closed } at " + i);
                    } else if (pushedBracket == '(') {
                        System.out.println("Error: opened ( but closed } at " + i);
                    } else if (pushedBracket == '{') {
                        System.out.println("{} " + true);
                    } else if(st.isEmpty()){
                        System.out.println("Error: not opened but closed } at " + i);
                    }
                    break;

                // if another char
                default:
                    break;
            }
        }


    }
}


