// Last updated: 08/02/2026, 20:04:20
class Solution {
    public int missingNumber(int[] nums) {
       int n= nums.length;
       int total=(n*(n+1))/2;
       int sum=0;
       for(int num:nums){
        sum+=num;
       } return total-sum;
    }
}