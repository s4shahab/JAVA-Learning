import java.util.InputMismatchException;
import java.util.Scanner;

public class cwh_81_specific_exceptions_handling {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=75;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array index");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide with ");
        int number=sc.nextInt();

        try {
            System.out.println("The value at array index entered is :" +marks[ind]);
            System.out.println("The value of array-value/number is :" +marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("The ArithmeticException error is "+e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is " +e);
        }

        catch (InputMismatchException e){
            System.out.println("Input Mismatch Exception is "+e);
        }
        catch (Exception e){
            System.out.println("Some other exceptions is " +e);
        }


    }
}
