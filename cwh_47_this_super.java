class Ekclass{

    Ekclass(int a){
        System.out.println("step 1");
        this.a=a;
        System.out.println("step 2");

    }
    int a;

    public int getA() {
        System.out.println("step 3");
        return a;

    }

    public int returnone(){
        System.out.println("step 4");
        return 1;
    }
}

class DClass extends Ekclass{
    DClass(int z){

        super(z);
        System.out.println("step 5");
        System.out.println("I am constructor of DClass");
    }
}

//before super not taking any sout


public class cwh_47_this_super {

    public static void main(String[] args) {

        System.out.println("step 6");

        Ekclass ekc=new Ekclass(5);
        System.out.println("step 7");
        DClass dkc=new DClass(45);
        System.out.println("step 8");
//        System.out.println(ekc.getA());

    }}
