// Last updated: 08/02/2026, 20:04:15
class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0 
                && (n & (n - 1)) == 0   // check if n is a power of two
                && (n & 0b01010101010101010101010101010101) != 0); // ensure it's power of four
    }
}