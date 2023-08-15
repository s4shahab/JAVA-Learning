import java.util.ArrayDeque;

public class cwh_93_ArrayDeque {
    public static void main(String[] args) {
//        Array Deque makes an internal array which look for internal things.
//        Double ended que

        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(5);
        ad1.add(25);
        ad1.addLast(35);
        ad1.addFirst(45);

        System.out.println(ad1);
        System.out.println(ad1.getLast());
        System.out.println(ad1.getFirst());

    }
}
