class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;

    }

    public void setId(int n1){
        this.id=n1;

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name=n;
    }
}


public class cwh_40_accessmodifiers {
    public static void main(String[] args) {

        MyEmployee emp=new MyEmployee();

        emp.setName("CodewithHarry"); //running setName method on emp object
        System.out.println(emp.getName());

        emp.setId(225);
        System.out.println(emp.getId());
//

    }
}
