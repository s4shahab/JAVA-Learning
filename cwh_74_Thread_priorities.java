class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while (i<10){
            System.out.println("I am thread priorties"+this.getName());
            i++;

        }

    }
}

public class cwh_74_Thread_priorities {
    public static void main(String[] args) {

        MyThr1 t1=new MyThr1(" a");
        MyThr1 t2=new MyThr1(" b");
        MyThr1 t3=new MyThr1(" c");
        MyThr1 t4=new MyThr1(" d");
        MyThr1 t5=new MyThr1(" e (Most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
