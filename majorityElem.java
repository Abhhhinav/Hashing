import java.util.*;
public class majorityElem {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1,2,2,2,2,2,2,3,3,3,3,3,3,3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
//int arr[] = {1,2,3,2,3,1,3,2,1,1,4};
// int threshold = arr.length/3;
// boolean found = false;
// for (int i = 0; i < arr.length; i++) {
//             int count = 0;
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             if(count>threshold){
//                 System.out.println(arr[i]);
//                 found = true;
//                 break;
//             }
//            }
//            if(!found){
//             System.out.println("No ELemnt found");
//           }