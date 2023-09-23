import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();

        int i,j,flag=0;
        i=0;
        j=s.length()-1;

        while (i<j && flag==0){
            if (s.charAt(i) != s.charAt(j)) {
                flag=1;
                break;
            }
            i++;
            j--;
        }

        if (flag==0){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }





    }
}
