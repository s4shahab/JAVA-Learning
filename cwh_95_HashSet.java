import java.util.HashSet;

public class cwh_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> HS=new HashSet<>(6,0.5f);
        HS.add(6);
        HS.add(12);
        HS.add(3);
        HS.add(11);
        HS.add(11);

        System.out.println(HS);
    }
}
