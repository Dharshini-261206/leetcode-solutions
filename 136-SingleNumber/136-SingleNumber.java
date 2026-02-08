// Last updated: 08/02/2026, 20:04:34
import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i]; 
            }
        }
        return nums[nums.length - 1];
    }
}