import  java.util.Scanner;
public class cwh_19_Practice_ConditionalSwitch {
    public static void main(String[] args) {
//        Q1
        int a=10;
        if(a==11){
            System.out.println("I am 10");
        }
        else {
            System.out.println("I am not 10");
        }

//        Q2
        System.out.println("Enter marks of Physics");
        Scanner sc=new Scanner(System.in);
        int phy=sc.nextInt();

        System.out.println("Enter marks of Chemistry");
        int cehm=sc.nextInt();

        System.out.println("Enter marks of Maths");
        int math=sc.nextInt();

        float avg=(phy+cehm+math)/3.0f;

        if (phy>=33 && cehm>=33 && math>=33 && avg>=40 ) {
            System.out.println("The student is passed and percentage is :"+ (avg));
        }


        else {
            System.out.println("You are fail");
        }

//        Question 03
//        calculate income tax paid by employee if income slabs vary

        System.out.println("Enter the income scale in Lac of employee");

        float income=sc.nextFloat();

        System.out.println("The entered income is :"+income);

        if (income<2.5f){
            System.out.println("There is no tax deduction");
        } else if (income>=2.5f && income <5f) {
            System.out.println("The tax class is 5%");
            
        } else if (income>=5f && income<10f) {
            System.out.println("The tax is 20%");
            
        } else if (income>=10f) {
            System.out.println("The tax is 30%");
            
        }
        else {
            System.out.println("wrong input");
        }

//        Question 04
// checking the day of weak on basis of number input from 1 to 7

        System.out.println("Enter the number from 1 to 7");
        int nmbr=sc.nextInt();

        if(nmbr==1){
            System.out.println("Its Monday");
        } else if (nmbr==2) {
            System.out.println("Its Tuesday");

        } else if (nmbr==3) {
            System.out.println("Its Wednesday");
        } else if (nmbr==4) {
            System.out.println("Its Thursday");
        } else if (nmbr==5) {
            System.out.println("Its Friday");
        } else if (nmbr==6) {
            System.out.println("Its Saturday");
        } else if (nmbr==7) {
            System.out.println("Its Sunday");
        }

        else {
            System.out.println("Please enter number from 1 to 7");
        }

//        Question 7

//        find the type of website

        System.out.println("Enter the addeess of website ");
        String str=sc.next();

        if(str.endsWith(".com")){
            System.out.println("Its comerical website");




        } else if (str.endsWith(".in")) {
            System.out.println("indian website");
        }

        else if (str.endsWith(".org")){
            System.out.println("its organizatonal website");
        }

        else {
            System.out.println("Its any random website");
        }

    }
}
