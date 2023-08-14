public class cwh_80_try_catch_block {


    public static void main(String[] args) {
        int a=600;
        int b=0;

        try {
            int c=a/b;
            System.out.println("The result is "+c);

        }
        catch (Exception e1){
            System.out.println("we failed to divide Reason is\n "+e1);
        }

        System.out.println("End of Program");

    }
}
