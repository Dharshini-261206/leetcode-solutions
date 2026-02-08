// Last updated: 08/02/2026, 20:04:42
class Solution {
    public int maxSubArray(int[] nums) {
        
        int cs=0;
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];

        if(cs>max){
            max=cs;
        }
            if(cs<0){
              cs=0;
            }
        
        }
        
        return max;
    }
}