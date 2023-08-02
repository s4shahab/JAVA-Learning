import java.util.Scanner;
public class cwh_29_practice_arrays {
    public static void main(String[] args) {
//        create an array of 5 floats and find their sum

        float total=0f;
        float [] arr={10.5f,12.5f,15.5f,2.5f,5.5f};
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }

        System.out.println("The sum of array elements is "+total);

//        create a program to tell whether a given integer is present in the array or not



        int [] arr1={4,5,6,8,12};

        System.out.println("Enter integer to find in array :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        boolean isInArray=false;
        for(int i=0;i< arr1.length;i++){
            if (arr1[i]==a){
                isInArray =true;
                break;

            }



        }
        if(isInArray){
            System.out.println("The integer is present in the ary");
        }

        else {
            System.out.println("not present");
        }

//        question 03

        int sumofmarks=0;
        int [] marks={85,85,85,85,85};
        for (int element:marks){
            sumofmarks=sumofmarks+element;

        }

        float avg=sumofmarks/marks.length;
        System.out.println("The avg of marks is :"+avg);

//        java program to add two matrices of size 2*3

        int [][] matr1={{4,5,6},
                        {1,2,3}};

        int [][] matr2={{4,5,6},
                        {1,2,3}};

        int [][] result={{0,0,0,},
                        {0,0,0}};

        for(int i=0;i< matr1.length;i++){ //row number of times
            for (int j=0;j<matr1[i].length;j++){ //column number of times
                System.out.format("Setting value for i=%d and j=%d \n",i,j);
                        result[i][j]=matr1[i][j]+matr2[i][j];
                System.out.print("\n");

            }
        }

        for(int i=0;i< matr1.length;i++){ //row number of times
            for (int j=0;j<matr1[i].length;j++){ //column number of times
                System.out.print(result[i][j]+ " ");
                result[i][j]=matr1[i][j]+matr2[i][j];


            }
            System.out.println("");
        }

//        Reverse and array
        System.out.println("Reversing an array");

    int [] array= {1,2,3,4,5,6};
    int l= array.length;
        int n=Math.floorDiv(array.length,2);
//        System.out.println(n);

        for (int i=0;i<n;i++){
//            swap array[i] and array[l-1-i]
            int temp=array[i];
            array[i]=array[l-1-i];
            array[l-1-i]=temp;

        }

        for (int element:array){
            System.out.print(element+ " ");
        }

//        finding maximum value of an array
        int [] ar={1,5,233,4,25,0,6};
        int max=0;
        for (int element:ar){
            if(element>max){
                max=element;
            }

        }
        System.out.println("The maximum value of array is : "+max);

//        finding the minimum value of an integer

        System.out.println(Integer.MIN_VALUE);

        int [] ars={1,5,233,4,25,6};
        int min=Integer.MAX_VALUE;
        for (int element:ars){
            if(element<min){
                min=element;
            }

        }
        System.out.println("The minimum value of array is : "+min);


//        to find weather an array is sorted or not

        System.out.println("find weather an array is sorted or not");
        boolean isSorted=true;
        int [] aaa={1,2,3,4,5,6,7};
        for (int i=0;i<aaa.length-1;i++){
            if (aaa[i]>aaa[i+1]){
                isSorted=false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }







    }
}
