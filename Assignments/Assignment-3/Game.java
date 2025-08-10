package week4.assignment;

import java.util.*;

public class Game {
    public static List<Integer> processMoves(List<Integer> moves) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int move : moves) {
            freqMap.put(move, freqMap.getOrDefault(move, 0) + 1);
        }

        int sum = 0;
        for (int count : freqMap.values()) {
            sum += count;
        }
        double avg = (double) sum / freqMap.size();

        Iterator<Map.Entry<Integer, Integer>> it = freqMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            if (entry.getValue() < avg) {
                it.remove();
            }
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(freqMap.entrySet());
        sortedEntries.sort((a, b) -> {
            if (!b.getValue().equals(a.getValue())) {
                return b.getValue() - a.getValue(); 
            }
            return a.getKey() - b.getKey(); 
        });

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            result.add(entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> moves = Arrays.asList(2, 3, 2, 4, 3, 2, 5, 4);
        System.out.println(processMoves(moves));
    }
}

