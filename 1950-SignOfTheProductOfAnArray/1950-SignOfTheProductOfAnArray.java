// Last updated: 08/02/2026, 20:02:54
class Solution {
    public int arraySign(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
               return 0;

            }
            else if(nums[i]<0){
                sum++;
            }
        }if(sum%2==0){
            return 1;
        }
        else{
            return -1;
        }
    }
}