package classwork;

public class SwitchCaseExample {

    public static void main(String[] args) {

        int a = 3;
        int n = 4;
        switch (a) {
            case 0:
                System.out.println("a = 0");
                break;
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                switch (n){
                    case 4:
                        System.out.println("n = 4, a = 3");
                }
                break;
            default:
                System.out.println("a > 3");
        }
    }

}


