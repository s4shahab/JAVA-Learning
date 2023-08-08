abstract class parent{
    public parent(){
        System.out.println("I am constructor of abstract class parent : ");


    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet1();
    abstract public void greet2();

}

class child extends parent{
    @Override
    public void greet1()
    {
        System.out.println("Good Morning ");
    }
    @Override
    public void greet2(){
        System.out.println("Good evening ");
    }
}
abstract class child2 extends parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class cwh_53_abstract {
    public static void main(String[] args) {
//        abstract class itself does not have object, It helps other to create class..and all the abstract methods of abstract class to be implemented in derived/concrete class.
//        Further another abstract class can be made
//        we can not made object until concrete class is made
//        in abstract class , we can have both abstract and normal methods, at least 1 abstract method

//        parent pobj=new parent(); // error

        child cobj=new child();  //ok

//        child2 c2obj=new child2(); /error



    }
}
