// Last updated: 08/02/2026, 20:02:59
import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int pairs = 0;

        
        for (int x : nums) {
            pairs+= freq.getOrDefault(x,0);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }


        return pairs;
    }
}