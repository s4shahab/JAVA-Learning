class MyMainEmployee{
    private int id;
    private String name;

    private int sal;

//    The constructor is method with same name as class , and it is automatically invoke when the object is created of that class
//    and after creating constructor we do not need getter and setter to do

//    constructor overloading , when two or more constructor made

    public MyMainEmployee(){
        id=45;
        name="CodeWithHarry";
        sal=500;


    }




    public MyMainEmployee(String myname,int myid,int mysalary){
        id=myid;
        name=myname;
        sal=mysalary;


    }

    public int getSal(){
        return sal;
    }





    public int getId(){
        return id;

    }

//    public void setId(int n1){
//        this.id=n1;
//
//    }

    public String getName(){
        return name;
    }

//    public void setName(String n){
//        this.name=n;
//    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {

        MyMainEmployee hary=new MyMainEmployee("argumentName",100,10000);
//        MyMainEmployee hary=new MyMainEmployee();
//        hary.setName("Harry");
//        hary.setId(400);

        System.out.println(hary.getName());
        System.out.println(hary.getId());
        System.out.println(hary.getSal());


    }
}
