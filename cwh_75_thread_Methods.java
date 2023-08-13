class MyThrd1 extends Thread{


    public void run(){
        int i=0;
        while (i<500){
            System.out.println("I am thread 1");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;

        }

    }
}

class MyThrd2 extends Thread{


    public void run(){
        while (true){
            System.out.println("I am thread 2");

        }

    }
}

public class cwh_75_thread_Methods {
    public static void main(String[] args) {

        MyThrd1 t1=new MyThrd1();
        MyThrd2 t2=new MyThrd2();

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();

    }
}
