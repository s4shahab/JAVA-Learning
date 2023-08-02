import java.util.Scanner;
public class cwh_17_18_RelationalLogicalOperators_switch {
    public static void main(String[] args) {
//        Logical AND Operators
        boolean a=false;
        boolean b=false;
        boolean c=true;
        if(a&&b){
            System.out.println("T");
        }
        else {
            System.out.println("F");
        }

//
        if (a&&b&&c){
            System.out.println("a and b and c are true");
        }

        else {
            System.out.println("a or b  or c are not true");
        }

//        Logical OR operations
        if (a || b){
            System.out.println(" a or b are true");

        }
        else {
            System.out.println("a and b are both false");
        }

//        NOT operator

        boolean z=true;
        System.out.println("Not of z is "+!z);

//        else if caluse

        System.out.println("Enter your age: ");
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();


        if (age<20){
            System.out.println("You are NOT experienced");

        } else if (age>=20 && age<=30) {
            System.out.println("you are little experienced");
        }

        else {
            System.out.println("You are full experienced");
        }

//        Switch Case

        System.out.println("Enter marks");
        Scanner newsc=new Scanner(System.in);
        int marks= newsc.nextInt();

        switch (marks){
            case 50:
                System.out.println("you are fail");
                break;

            case 70:
                System.out.println("you are good in grades");
                break;

            case 90:
                System.out.println("you have great marks:congratulations");
                break;
            default:
                System.out.println("Enjoy your life");

        }
        System.out.println("Thanks for using java");

//        Character switch case
        System.out.println("Enter character");
        Scanner str=new Scanner(System.in);
        String charcter=str.next();

        switch (charcter) {
            case "a" -> System.out.println("The letter is a ");
            case "c" -> System.out.println("The letter is c");
            default -> System.out.println("The letter is not a and c ");
        }




    }
}

