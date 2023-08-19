import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();  //This is date
        System.out.println(dt);

//        DateTimeFormatter dd=DateTimeFormatter.ofPattern("MM-dd-YYYY"); //This is format
        DateTimeFormatter dd=DateTimeFormatter.ofPattern("MM/dd/YYYY --E --a"); //This is format
        DateTimeFormatter dd1=DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate=dt.format(dd);
        System.out.println(myDate);
        String myDate1=dt.format(dd1);
        System.out.println(myDate1);
    }
}
