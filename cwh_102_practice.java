import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh_102_practice {
    public static void main(String[] args) {
//        Question 01
        ArrayList ar=new ArrayList();
        ar.add("Student 01");
        ar.add("Student 02");
        ar.add("Student 03");
        ar.add("Student 04");
        ar.add("Student 05");
        ar.add("Student 06");
        ar.add("Student 07");
        ar.add("Student 08");
        ar.add("Student 09");
        ar.add("Student 10");

        for (Object o:ar){
            System.out.println(o);
        }

//        Question 02

        Date d=new Date();
        System.out.println(d.getHours() +":"+d.getMinutes()+":"+d.getSeconds());

//        Question 03
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

//        Question 05

        HashSet<Integer> s=new HashSet();
        s.add(5);
        s.add(12);
        s.add(4);
        s.add(6);
        s.add(7);
        System.out.println(s);
    }
}
