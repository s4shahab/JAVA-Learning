import java.util.*;

public class cwh_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);

        l2.add(55);
        l2.add(66);
        l2.add(88);

        l1.add(5);
        l1.add(6);
        l1.add(6);
        l1.add(8);
        l1.add(6);
        l1.add(12);
        l1.add(0,25);
        l1.add(0,30);
//        l1.addAll(l2); // will add l2 at end
        l1.addAll(0,l2);
        l1.set(3,95);
        l1.remove(2);


        System.out.println(l1.contains(50));
        System.out.println(l1.indexOf(30));
        System.out.println("The last index of 6 is "+l1.lastIndexOf(6));



//        l1.clear();


        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }


    }
}
