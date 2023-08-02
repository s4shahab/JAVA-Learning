public class cwh_33_variableArguments {

//    static int sum(int a, int b){
//        return a+b;
//    }


//    static int sum(int a,int b, int c){
//        return a+b+c;
//    }

//    when we need atleast 1 argument that is int x
    static int sum(int x,int ...arr){
//        available as int [] arr
        int result=x;
        for (int a:arr){
            result+=a;

        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println("The sum of a and b is : "+sum(5));
        System.out.println("The sum of a and b and c is: "+sum(4,8,12));
        System.out.println("The sum of a and b and c and d is: "+sum(4,8,12,12));

    }
}
