class Th1 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }

    }



}

class Th2 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }

    }
}

public class cwh_76_thread_practice {
    public static void main(String[] args) {

        Th1 t1=new Th1();
        Th2 t2=new Th2();

//        t1.setPriority(6);
//        t2.setPriority(9);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        System.out.println(t2.getState());


//        t1.start();
        t2.start();

        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
