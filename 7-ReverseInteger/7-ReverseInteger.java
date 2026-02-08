// Last updated: 08/02/2026, 20:04:46
class Solution {
    public int reverse(int x) {
        int copy = x;
        long count = 0; // use long to handle overflow during calculation

        while (copy != 0) {
            int rem = copy % 10;          // get last digit
            count = (count * 10) + rem; // build reversed number
            copy = copy / 10;             // remove last digit
        }

        // check for overflow
        if (count > Integer.MAX_VALUE || count < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) count;
    }
}