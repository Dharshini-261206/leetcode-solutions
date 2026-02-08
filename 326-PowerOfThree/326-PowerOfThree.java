// Last updated: 08/02/2026, 20:04:17
class Solution {
    public boolean isPowerOfThree(int n) {
            if(n==0) return false;
        
           while(n%3==0){
            n=n/3;
            
           }
           if(n==1){
            return true;
           }
           return false;
    }
}