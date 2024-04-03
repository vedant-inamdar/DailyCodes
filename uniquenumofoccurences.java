import java.util.*;
class uniquenumofoccurences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrencesMap = new HashMap<>();
        for (int i : arr) {
            occurrencesMap.put(i, occurrencesMap.getOrDefault(i, 0) + 1);
        }
        
        HashSet<Integer> uniqueCountsSet = new HashSet<>();

        for (int count : occurrencesMap.values()) {
            if (!uniqueCountsSet.add(count)) {
                return false;
            }
        }

        return true;
    }
}