import java.util.Scanner;

public class cwh_86_Practice_Errors_Exception {
    public static void main(String[] args) {

//        problem 02

        try {
            int result=999/0;
        }

        catch (IllegalArgumentException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

//        problem 03

        boolean flag=true;
        int []mark=new int[3];
        mark[0]=5;
        mark[1]=45;
        mark[2]=20;

        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;


        while (flag&&i<5){
            try {
                System.out.println("Enter the value of index ");
                index =sc.nextInt();

                System.out.println("the value of mark[index] is " +mark[index]);
                break;
            }

            catch (Exception e){
                System.out.println("invalid index");
            }
            i++;



        }

        if (i>=5){
            System.out.println("Error");
        }

    }
}
