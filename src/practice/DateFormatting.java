package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

    // Simple Date Formatting
    Date dateNow = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, MMM d, yyyy 'at' hh:mm:ss a zzz");

    // Display formatted date and time
    public void display() {
        System.out.println(simpleDateFormat.format(dateNow));
    }

}
