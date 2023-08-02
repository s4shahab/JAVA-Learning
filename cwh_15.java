import  java.util.Scanner;
public class cwh_15 {

    public static void main(String[] args) {
        String ss="My name IS HARRY";
        System.out.println(ss.toLowerCase());

//

        String newstr="Shahab   Uddin Ahmed   ";
        String text=newstr.replace(" ","_");
        System.out.println(text);

        Scanner input=new Scanner(System.in);
        String valueinput=input.next();

        System.out.println("Hello "+valueinput + " Thanks a lot");
        System.out.println(valueinput.replace(valueinput,"Hary"));

//
        String s="This is double  and tripple  spaces";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));

//
        String letter="Dear Harry\n This Java course is nice\n\t Thanks";
        System.out.println(letter);
        System.out.println();

//


    }}
