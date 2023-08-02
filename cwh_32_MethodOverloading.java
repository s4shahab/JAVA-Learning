public class cwh_32_MethodOverloading {

//    the below three methods are method overloading examples have same name but different parameters
    static void fao(){
        System.out.println("Good Morning");
    }

    static void fao(int a){
        System.out.println("Good morning "+a+" Brother");
    }

    static  void fao(int a,int b){
        System.out.println("Good morning "+a+ " Brother " );
        System.out.println("Good morning "+b+ " Brother " );

    }




    static void change(int a){
        a=98;

    }

    static  void  change2(int [] arrays){
        arrays[0]=98;

    }
    static void telljoke(){
        System.out.println("I inveneted the word \n"+"Palagarism");

    }
    public static void main(String[] args) {
//        telljoke();


//              case 01
//              changing the integer
//            int x=45;
//            change(x);
//        System.out.println("The value of x after running change is : "+x);

//        case 02
//        changing the array
//        as we pass object here as reference so it will be changed
        int [] arrays={4,5,8,122,1,2};
        change2(arrays);
        System.out.println("The value of arrays[0] after running the change2 is :"+arrays[0]);

//        Method overloading
        fao();
        fao(300);
        fao(3000,4000);



    }
}
