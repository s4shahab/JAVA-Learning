public class cwh_35_QuestionMethods {

//    question 01

    static void multiplication(int n){
        for (int i=0;i<11;i++){
            System.out.format("%d X %d = %d",n,i,n*i);
            System.out.println("");
        }
    }


//    question 02

    static void pattern(int a){
        for (int i=0;i<a;i++){
            for (int j=0;j<i+1;j++){
                System.out.format("*");

            }
            System.out.println("");
        }
    }

//    question 03

//    sum(n)=1+2+3+4+5+6,,,,+n
//    sum(n)=1+2+3+...+(n-1)+n
//    sum(n)=sum(n-1)+n
//total=n(n+1)/2
    static int summ(int b){
        if ( b==1){
            return 1;
        }
        return b+summ(b-1);

    }


//    Question 04

    static void patt(int c){
        for (int i=c;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.format("*");

            }
            System.out.println("");
        }
    }

//    Question 05

//    fibonacci series 0 1 1 2 3 5 8 13

    static int fib(int d){
        if (d==1){
            return 0;

        } else if (d==2) {
            return 1;

        }

        else {
            return fib(d-1)+fib(d-2);
        }


    }

    public static void main(String[] args) {
//        Problem 01--Write a program to print multiplicgtion table using function

        multiplication(7);

//        problem 02--write a program to print the following pattern

//        *
//        **
//        ***
//        ****

        pattern(4);

//        Problem 03--write a recursive function to calculate sum of n natural numbers

        int total=summ(4);
        System.out.println("The sum of n natural number is :" +total);


//        Problem 04

        patt(6);

//        Question 05--Write a program to print nth term of fibonacci series using recursion

        int result=fib(8);
        System.out.println(result);





    }
}
