public class cwh_34_Recursion {


//    Recursive approach
    static int factorial (int n){
//        5!=5*4*3*2*1

//        factorial(n)=n*factorial(n-1)

        if (n==0 || n==1){
            return 1;
        }

        else {
            return n * factorial(n-1);
        }
    }

//    Itterative approach



    static int factorial_ite(int s){
        if (s==0 || s==1){
            return 1;
        }

        else {
            int factorial=1;
            for (int i=1;i<=s;i++){
                factorial=factorial*i;

            }
            return factorial;
        }
    }




    public static void main(String[] args) {
        int x=5;
        System.out.println("The value of factorial n is :"+factorial(x));
        System.out.println("The value of factorial iterative approach is :"+factorial_ite(x));

    }
}
