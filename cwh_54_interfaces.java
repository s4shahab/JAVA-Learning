interface Bicycle{

    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{

    int b=90;
    void hornapplyBreak();
    void hornspeedUp();

}

class Cycle implements Bicycle,HornBicycle{
    public void applyBreak(int decrement){
        System.out.println("applying break");

    }

    public void speedUp(int increment){
        System.out.println("speed up");
    }

    public void hornapplyBreak(){
        System.out.println("horn break");

    }
    public void hornspeedUp(){
        System.out.println("horn speed");

    }

}

//abstract methods must be public

public class cwh_54_interfaces {
    public static void main(String[] args) {
//        object of interface can not be created
//        reference of interface can be created

//        we use implements keyword instead of extends when implementing an interface

//        can create properties/ variable in interface
//        but can not modify properties in interface as they are final

//        if we write a property in a interface then it can be modified in class

        Cycle mycle=new Cycle();
        mycle.applyBreak(4);

        mycle.hornapplyBreak();
        mycle.hornspeedUp();

//        System.out.println(mycle.a);


    }
}
