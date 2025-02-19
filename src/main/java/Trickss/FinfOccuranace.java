package Trickss;

import java.util.HashMap;
import java.util.Map;

public class FinfOccuranace {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
