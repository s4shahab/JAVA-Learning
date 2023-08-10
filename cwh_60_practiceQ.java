abstract class pen{
    abstract void write();
    abstract void refil();
}

class FountainPen extends pen{
    void write(){
        System.out.println("writing");
    }

    void refil(){
        System.out.println("refilling");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}
class Monkey{
    void jump(){

    }
    void bite(){

    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir");
    }

   public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

}

public class cwh_60_practiceQ {
    public static void main(String[] args) {
//        problem 01
//        problem 02
        FountainPen objFP=new FountainPen();
        objFP.write();
        objFP.refil();
        objFP.changeNib();

//        problem 03

        Human objH=new Human();
        objH.sleep();

//        Question 05

        Monkey objM=new Human();
        objM.jump();
        objM.bite();

        BasicAnimal objBA= new Human();
        objBA.eat();
        objBA.sleep();
    }
}
