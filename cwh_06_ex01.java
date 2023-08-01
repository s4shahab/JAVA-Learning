import java.util.Scanner;

public class cwh_06_ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter maximum marks of 1 subject :");
        float t=sc.nextFloat();

        System.out.println("Enter 1st subject marks out of :"+t);
        float a= sc.nextFloat();

        System.out.println("Enter 2nd subject marks out of  :" +t);
        float b=sc.nextFloat();

        System.out.println("Enter 3rd subject marks out of  :"+t);
        float c=sc.nextFloat();

        System.out.println("Enter 4th subject marks out of :"+t);
        float d= sc.nextFloat();

        System.out.println("Enter 5th subject marks out of  :"+t);
        float e=sc.nextFloat();

        float total=(a+b+c+d+e)*100/(t*5);
        System.out.println("The percentage of student is :" + total);


    }
}
