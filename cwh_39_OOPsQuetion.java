class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;

    }

    public void setName(String n){
        name=n;

    }



}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing");

    }

    public void vibrating(){
        System.out.println("Vibrating");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }

    public  int parameter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int height;

    public int area(){
        return length*height;
    }

    public int parameter(){
        return 2*length+2*height;
    }
}

class circle{
    float radius;

    public float area(){
        return 3.14f*radius*radius;
    }

    public float parameter(){
        return 2*3.14f*radius;
    }
}

public class cwh_39_OOPsQuetion {

    public static void main(String[] args) {
//        Problem 01
        Employee1 harry=new Employee1();
            harry.setName("Code with harry");
            harry.salary=233;
            String out=harry.getName();
        System.out.println(out);
        System.out.println(harry.getSalary());

//        problem 02

        CellPhone asus=new CellPhone();
        asus.ringing();
        asus.vibrating();

//        Problem 03

        square sq=new square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.parameter());

//        Problem 04

        rectangle rec=new rectangle();

        rec.length=8;
        rec.height=12;
        System.out.println(rec.area());
        System.out.println(rec.parameter());


//        problem 06 for circle
        circle cir=new circle();


        cir.radius=1.5f;
        System.out.println(cir.area());
        System.out.println(cir.parameter());






    }
}
