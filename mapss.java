import java.util.*;
public class mapss {
    public static void main(String[] args) {
        
        //create
        HashMap<String,Integer>hm = new HashMap<>();
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();
        TreeMap<String,Integer>tm = new TreeMap<>();
        //insert
        hm.put("India",100);
        hm.put("China",100);
        hm.put("AUstralia",50);
        // System.out.println(hm.get("India"));
        // System.out.println(hm.containsKey("India"));
        hm.remove("India");
        System.out.println(hm);
        System.out.println(hm.size());
        // System.out.println(hm.isEmpty());
        
        Set<String>keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Key="+k);
        }

        System.out.println("-------------------------");
        lhm.put("Indonesia", 600);
        lhm.put("Indon", 600);
        lhm.put("Indon", 700);
        System.out.println(lhm);

        
        System.out.println("-------------------------");
        tm.put("Abhi",12);
        tm.put("bdc",3);
        tm.put("lfdsfs",90);
        System.out.println(tm);
        for (String k : keys) {
            System.out.println("Key="+k);
        }
    }
}
