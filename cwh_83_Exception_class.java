import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage() {
        return " I am getMessage";
    }
}

public class cwh_83_Exception_class {
    public static void main(String[] args) {

        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a ");
        a=sc.nextInt();
        if (a<9){
            try {
//                throw new MyException();
                throw new ArithmeticException("This is exception");

            }

            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished ");
            }

        }

    }
}
