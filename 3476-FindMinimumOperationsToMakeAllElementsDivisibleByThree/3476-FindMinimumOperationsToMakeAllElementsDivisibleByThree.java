// Last updated: 08/02/2026, 20:02:18
class Solution {
    public int minimumOperations(int[] nums) {
        int operations =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                operations++;
            }
        }return operations;
           

        
    }
}