class Ekclass{

    Ekclass(int a){
        this.a=a;

    }
    int a;

    public int getA() {
        return a;
    }

    public int returnone(){
        return 1;
    }
}

class DClass extends Ekclass{
    DClass(int z){
        super(z);
        System.out.println("I am constructor of DClass");
    }
}


public class cwh_47_this_super {

    public static void main(String[] args) {

        Ekclass ekc=new Ekclass(5);
        DClass dkc=new DClass(45);
        System.out.println(ekc.getA());

    }}
