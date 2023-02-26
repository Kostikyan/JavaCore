package homework.homework15.medicalCenter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public SimpleDateFormat ddMMyyyyHHm = new SimpleDateFormat("dd/MM/yyyy HH:m");
    public SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");

    public boolean checkEqualDate(Date date1, Date date2) {
        return ddMMyyyy.format(date1).equals(ddMMyyyy.format(date2));
    }

}
