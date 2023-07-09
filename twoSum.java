import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        int result[] = two(arr, target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] two(int arr[], int target) {
        int result[] = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(target - arr[i])) {
                result[0] = hm.get(target - arr[i]);
                result[1] = i;
            }
            hm.put(arr[i], i);
        }
        return result;
    }
}
