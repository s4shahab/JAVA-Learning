interface sampleInterface{
    void method1();
    void method2();

}

interface childSampleInterface extends sampleInterface{
    void method3();
    void method4();

}

class MySampleClass implements childSampleInterface{
    public void method1(){
        System.out.println("Method 1");

    }

    public void method2(){
        System.out.println("method 2");
    }

    public void method3(){
        System.out.println("method 3");
    }
    public void method4(){
        System.out.println("method 4");
    }
}
public class cwh_58_inheritance_in_interfaces {
    public static void main(String[] args) {

        MySampleClass obj=new MySampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();

    }
}
//we defined method 1 and 2 in class, because childsampleinterface is extending sampleinterface.
