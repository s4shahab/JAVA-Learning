class A{
    public int harry(){
        return 4;
    }

    public void jarry(){
        System.out.println("this is jarry of class A");  // for method overriding
    }
}

//method overloading and  method overriding are different,,, overloading is the one class have two methods but with different parameter
//static method can not be over-ride
class B extends A{
    public void sarry(){
        System.out.println("I am sarry");
    }
    @Override
    public void jarry(){
        System.out.println("I am jarry of class B"); // method overriding,, when use same method in derived class which is also present in parent class
    }
}

public class cwh_48_Method_overRiding {
    public static void main(String[] args) {

        A a=new A();
        a.jarry();

        B b=new B();
        b.jarry();

    }
}
