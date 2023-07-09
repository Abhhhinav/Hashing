import java.util.*;
public class sortFreq {
    public static void main(String[] args) {
        String str = "ttrreee";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        List<Character> sortedCharacters = new ArrayList<>(frequencyMap.keySet());
        sortedCharacters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        StringBuilder sortedString = new StringBuilder();
        for (char ch : sortedCharacters) {
            int frequency = frequencyMap.get(ch);
            for (int i = 0; i < frequency; i++) {
                sortedString.append(ch);
            }
        }
        System.out.println("Sorted string based on frequency: " + sortedString);
    }
}
