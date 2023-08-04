//There can be only one public class in a java file

//adding custom class
class Employee{
    int id;

    int salary;
    String name;



//    adding method
    public  void printDetails(){
        System.out.println("My id is :"+id);
        System.out.println("My name is :"+name);
    }

    public int getSalary(){
        return salary;
    }
}


public class cwh_38_OOPs {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry=new Employee(); //creating a new Employee object "harry"
        Employee John=new Employee(); //creating another object

//        setting attributes / properties for harry
        harry.id=54;
        harry.name="My yname is Harry";
        harry.salary=455;

        //        setting attributes / properties for John

        John.id=12;
        John.name="JOHHHHHHN";
        John.salary=500;

        harry.printDetails();
        John.printDetails();

        int salary= John.getSalary();
        System.out.println(salary);

//        printing the attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
}
