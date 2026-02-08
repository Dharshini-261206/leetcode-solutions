// Last updated: 08/02/2026, 20:04:27
class Solution {
    public int hammingWeight(int n) {
      int count=0;
      while(n!=0){
        int rem=n&1;
         n=n&(n-1);
            count++;
   
      }  
      return count;
    }
}