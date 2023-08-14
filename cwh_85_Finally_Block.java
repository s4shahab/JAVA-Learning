public class cwh_85_Finally_Block {
    public static int greet(){
        try {
            int a=15;
            int b=0;
            int c=a/b;
//            System.out.println(c);

            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("This runs at any cost , The programme is end");
        }
        return -1;

    }
    public static void main(String[] args) {
//        System.out.println(greet());

        int x=12;
        int y=4;
        while (true){
            try {
                System.out.println(x/y);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }

            finally {
                System.out.println("I am finally for value of y ="+y);
            }
            y--;
        }


    }
}
