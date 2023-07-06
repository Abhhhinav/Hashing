import java.util.*;
public class funct {
    public static void main(String[] args) {
        
        //create
        HashMap<String,Integer>hm = new HashMap<>();
        
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
    }
}
