package myJavaProjects;

import java.util.Scanner;

public class InfoAboutOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Info About Operators");
        int[] intForWhile = {1,2,3,4,5};
        int chInt = 0;
        do {
            System.out.println("What operator do you want to know about");
            System.out.println("\t1)If, else");
            System.out.println("\t2)While");
            System.out.println("\t3)For");
            System.out.println("\t4)Do While");
            System.out.println("\t5)Switch Case");
            System.out.print("Enter num: ");
            chInt = sc.nextInt();
            System.out.println();
        }while(chInt > 5 || chInt < 0);
        switch (chInt){
            case 1:
                System.out.println("if(condition) {");
                System.out.println("\tblock of code to be executed if the condition is true");
                System.out.print("}");
                System.out.println("else if(condition2) {");
                System.out.println("\tblock of code to be executed if the condition1 is false and condition2 is true");
                System.out.print("}");
                System.out.println("else {");
                System.out.println("\tblock of code to be executed if the condition1 is false and condition2 is false");
                System.out.println("}");
                break;
            case 2:
                System.out.println("while(condition){");
                System.out.println("\tcode block to be executed");
                System.out.println("}");
                break;
            case 3:
                System.out.println("for (statement 1; statement 2; statement 3) {");
                System.out.println("\tcode block to be executed");
                System.out.println("}");
                System.out.println("Statement 1 is executed (one time) before the execution of the code block.");
                System.out.println("Statement 2 defines the condition for executing the code block.");
                System.out.println("Statement 3 is executed (every time) after the code block has been executed.");
                break;
            case 4:
                System.out.println("do {");
                System.out.println("\tcode block to be executed");
                System.out.print("}");
                System.out.println("while(condition);");
                break;
            case 5:
                System.out.println("switch(expression) {");
                System.out.println("\tcase x:");
                System.out.println("\t\tcode block");
                System.out.println("\t\tbreak;");
                System.out.println("\tcase y:");
                System.out.println("\t\tcode block");
                System.out.println("\t\tbreak;");
                System.out.println("\tdefault:");
                System.out.println("\t\tcode block \n}");
                break;
        }
    }

}
