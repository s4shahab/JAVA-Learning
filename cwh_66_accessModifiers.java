class C1{
    public int x=4;
    private int y=6;
    int z=65;
    protected int a=25;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }


}

public class cwh_66_accessModifiers {
    public static void main(String[] args) {
        C1 c=new C1();
//        c.meth1();

        System.out.println(c.x);
//        System.out.println(c.y); //not access due to private private in same package
        System.out.println(c.z);
        System.out.println(c.a);
    }
}
