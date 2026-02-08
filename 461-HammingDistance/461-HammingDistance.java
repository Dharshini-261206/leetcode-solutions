// Last updated: 08/02/2026, 20:03:46
class Solution {
    public int hammingDistance(int x, int y) {
        int n= x^y;
        int rem=0;
        while(n!=0){
            rem += n&1;
            n>>=1;
        }return rem;
    }
}