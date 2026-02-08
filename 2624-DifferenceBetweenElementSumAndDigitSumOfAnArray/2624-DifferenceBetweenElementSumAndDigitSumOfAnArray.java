// Last updated: 08/02/2026, 20:02:35
class Solution {
    public int differenceOfSum(int[] nums) {
       int count =0;
       int sum=0;
       
       for(int num:nums){
            sum+=num;

       
       int rem;
       int copy=num;
        while(copy!=0){
            rem = copy%10;
            count+=rem;
            copy/=10;

       } 
       }
       return sum-count;
    }
}