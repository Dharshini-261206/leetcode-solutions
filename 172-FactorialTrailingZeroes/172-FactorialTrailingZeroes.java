// Last updated: 08/02/2026, 20:04:30
class Solution {
    public int trailingZeroes(int n) {
        if(n<=0){
            return 0;
        }
        
        int sum=0;
        while(n!=0){
            n/=5;
            sum+=n;
        }
        return sum;
    }
}