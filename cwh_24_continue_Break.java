public class cwh_24_continue_Break {
    public static void main(String[] args) {
//        break statement
        for (int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                System.out.println("breaking the loop");
                break;
            }
        }

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSS");

//        continue statement

        for(int a=0;a<20;a++){
            System.out.println(a);
            if(a==10){
                System.out.println("continue statemtn accoured");
                continue;
            }
            System.out.println("next iteration continue");

        }
    }
}
