package classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Birthday (dd-MM-yyyy): ");
        String s = sc.nextLine();
        Date date = sdf.parse(s);
        System.out.println(date);
        
    }

}
