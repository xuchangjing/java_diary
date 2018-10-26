import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeTranFormat {
    public static void main(String[] args) {
        String datetime = "26/Oct/2018:20:40:26 +0800";
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.US);
        Date d;
        try {
            d = sdf.parse(datetime);
            String str = String.valueOf(d);
            SimpleDateFormat newsdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(str);
//            Fri Oct 26 20:40:26 GMT+08:00 2018
            System.out.println(newsdf.format(d));
//            2018-10-26 20:40:26
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
