public class cwh_21_22_23_Loops {
    public static void main(String[] args) {
//        While loops

        int a=0;
        while (a<=5){
            System.out.println("The numbers are : " +a);
            a+=1;
        }

//        do while Loop

        int b=0;
        do {
            System.out.println("value of b is :"+b);
            b+=1;
        }
        while (b<=1);


//        for loop
        int count;

        for (count=0;count<=15;count++){
            System.out.println("For loop result is " +count);
        }

//        Write a program to print first n odd number using for loop

        int n=10;
        for (int i=0;i<n;i++){
            System.out.println(2*i+1);
        }

//        in reverse order


        for(int i=10;i>0;i--){
            System.out.println(i);
        }
    }
}
