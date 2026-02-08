// Last updated: 08/02/2026, 20:03:15
class Solution {
    public boolean hasAlternatingBits(int n) {
        int count =0;
        int prev=-1;
        while(n!=0){
            int rem =n&1;
            if(rem==prev){
                return false;
            }
            prev=rem;
            n>>=1;
        }return true;
    }
}