class MyThread extends  Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){

        int i=34;
        System.out.println("Thank you");
//        while (true){
//        System.out.println("I am a thread");
//        }
    }
}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {

        MyThread t1=new MyThread("harry");
        MyThread t2= new MyThread("Jarry");
        MyThread t3= new MyThread("Sarry");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The id of thread is "+t1.getId());
        System.out.println("The name of thread is "+t1.getName());
        System.out.println("The id of thread is "+t2.getId());
        System.out.println("The name of thread is "+t2.getName());
        System.out.println("The id of thread is "+t3.getId());
        System.out.println("The name of thread is "+t3.getName());


    }
}
