import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class cwh_82_Nested_try_catch {
    public static void main(String[] args) {

        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=75;

        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("Enter index of marks :");
            int ind=sc.nextInt();

            try {
                System.out.println("marks");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry the index is out of range");
                    System.out.println("exception at level 2");
                }


            }

            catch (Exception e){
                System.out.println("exception at level 2");

            }

        }
        System.out.println("Thanks for using this program");


    }
}
