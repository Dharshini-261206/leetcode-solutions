// Last updated: 08/02/2026, 20:03:12
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> h = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!h.add(nums[i])){
                return nums[i];
            }
        }return -1;
    }
}
