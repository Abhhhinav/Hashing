import java.util.HashSet;
public class sets {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        // if(set.contains(7)){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }
        set.remove(2);
        System.out.println(set.size());
        set.clear();
        // System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
