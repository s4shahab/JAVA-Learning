public class cwh_26_27_28__arrays {
    public static void main(String[] args) {
//        array is object in JAVA

        int [] marks=new int[5];

        int [] mark={10,20,3,5,8};
        System.out.println(mark[2]);


        marks[0]=100;
        marks[1]=20;
        marks[2]=30;
        marks[3]=50;
        marks[4]=150;
        marks[4]=12;

        System.out.println(marks[4]);
        System.out.println(marks.length);

        String [] student={"harry","shubam"};
        System.out.println(student.length);

//        display array using for loop
        for (int i=0;i<mark.length;i++){
            System.out.println(mark[i]);
        }

//        using for loop in reverse order

        for(int i=mark.length-1;i>=0;i--){
            System.out.println(mark[i]);
        }


        System.out.println("for each loop in Java");
//        for Each Loop in Java

        for(int element:mark){
            System.out.println(element);
        }

//        Multidimensional arrays

        int [] roll; // 1-D array
        int [][] flats; // 2-Da array

        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

//        [rows][columns]
//        [0 and 1][0 and 1 and 2]

//        display a 2-D array

        System.out.println("printing 2-D arrays");

        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }




    }
}
