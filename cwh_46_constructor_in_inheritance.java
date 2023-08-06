import org.w3c.dom.ls.LSOutput;

class Base1{

    Base1(){
        System.out.println("I am a base class constructor");
    }

    Base1(int a){
        System.out.println("I am an overloaded constructor of base class with value of a :"+a);

    }

}

class Derived1 extends Base1{
    Derived1 (){
//        super(0);
        System.out.println("I am derived class constructor");
    }

    Derived1(int a,int b){
        super(a);
        System.out.println("I am an overloaded constructor of derived class with value of b is :"+b);

    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived (){
        System.out.println("I am constructor of childOfDerived class");
    }

    ChildOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I am overloaded constructor of childOfDerived Class with value of c "+c);

    }
}

//when both base and derived class have constructor then , first base class constructor will run, and then derived class will run base+derived class constructor.
//when only base class have constructor and derived class do not have constructor, then first base class constructor will run then derived class will run base class constructor.
//if we want to run base class argument constructor then we can use super() keyword in derived class constructor.
//if we make object with no argument, then constructor with no argument runs,
public class cwh_46_constructor_in_inheritance {
    public static void main(String[] args) {

//        Base1 b1=new Base1();
//        Derived1 d1=new Derived1();
//        Derived1 d1=new Derived1(14,5);
//        ChildOfDerived c2=new ChildOfDerived();
        ChildOfDerived C1=new ChildOfDerived(4,2,5);

    }
}
