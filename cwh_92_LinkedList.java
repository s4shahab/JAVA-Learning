//import java.util.ArrayList;
import java.util.*;

public class cwh_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

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
        l1.addLast(625);
        l1.addFirst(526);


        System.out.println(l1.contains(50));
        System.out.println(l1.indexOf(30));
        System.out.println("The last index of 6 is "+l1.lastIndexOf(6));



//        l1.clear();


        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
