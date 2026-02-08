// Last updated: 08/02/2026, 20:04:29
class Solution {
    public int reverseBits(int n) {
        int copy=0;
    for(int i=0;i<32;i++){
        copy<<=1;
        copy=(copy|(n&1));
        n>>=1;
    }    return copy;
    }
}