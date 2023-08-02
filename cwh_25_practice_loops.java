public class cwh_25_practice_loops {
    public static void main(String[] args) {
//        to print pattern
//        ****
//        ***
//        **
//        *

//        question 01
        for (int n=4;n>0;n--) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        write a program to find sum of n even numbers using while loop

        int sum=0;
        int i=0;
        while (i<8){
            if(i%2==0){
            sum=sum+i;

            }
            i++;

        }
        System.out.println("The sum of n even number is :"+sum);

//        multiplication table of given number

        int number=5;
        for(i=1;i<11;i++){
            System.out.println(number+"x"+i+"="+number*i);
        }

//        multiplication table in reverse order

        int nmbr=10;
        for (i=10;i>0;i--){

            System.out.println("multiplication table of 10 in reverse order: "+nmbr+"x"+i+"="+nmbr*i);
        }

//        factorial of given number using for loop
//        factorial of 5=5*4*3*2*1

        System.out.println("factorial is: ");

        int n=5;
        int factorial=1;
        if(n==0 || n==1){
            System.out.println("factorial is 1");
        }

        else {
            for (i=1;i<=n;i++){
                factorial=factorial*i;
            }
            System.out.println("factorial is :"+factorial);
        }

//        factorial using while loop


        int c=1;
        int a=5;
        int factorials =1;

        if (n==0||n==1){
            System.out.println("the factorial is :"+factorials);
        }

        else {
            while (c<=a){
                factorials=factorials*c;
                c++;
            }
            System.out.println("The factorial using while loop is: "+factorials);
        }

//        write a program to sum values of table of 8

        int sums=0;
        for (int k=1;k<11;k++){
            sums=sums+8*k;
        }
        System.out.println("The sum of all value of table 8 is "+sums);





    }
}
