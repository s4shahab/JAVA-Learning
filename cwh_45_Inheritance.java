class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and  setting X now:");
        this.x = x;
    }

    public void printme(){
        System.out.println("I am a constructor");

    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting Y now");
        this.y = y;
    }
}

class Animal{
    public int type;
    public int size;

    public void speak(){
        System.out.println("Its speak like Dog");
    }



}
class Dog extends Animal{
    public void bark(){
        System.out.println("The dog is barking");
    }
}
public class cwh_45_Inheritance {
    public static void main(String[] args) {

//        creating an object of base class

        Base b=new Base();
        b.setX(45);
        System.out.println(b.getX());

//        creating an object of derived class
        Derived d=new Derived();
        d.setX(50);
        System.out.println(d.getX());


    }
}

//all properties of base class is available in derived class , but it is accessable or not , access modifier (public, private tell this)
//all public is accessible in derived class