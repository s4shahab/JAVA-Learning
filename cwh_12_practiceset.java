import java.util.Scanner;
public class cwh_12_practiceset {
    public static void main(String[] args) {
        float a=7/4f*9/2f;
        System.out.println(a);


//

        char grade='B';
        grade= (char)(grade+8); // focefully type casting
        System.out.println("The encrypted grade is " + grade);

        grade=(char)(grade-8);
        System.out.println(grade);

//

        Scanner sc=new Scanner(System.in);
        int f= sc.nextInt();
        System.out.println(f>8);


    }
}
