package homework.homework15.medicalCenter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    static public final SimpleDateFormat dateMinute = new SimpleDateFormat("dd/MM/yyyy HH:m");
    static public final SimpleDateFormat dateYear = new SimpleDateFormat("dd/MM/yyyy");

    public static boolean areTheDatesTheSame(Date date1, Date date2) {
        return dateYear.format(date1).equals(dateYear.format(date2));
    }

}
