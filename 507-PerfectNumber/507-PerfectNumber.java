// Last updated: 08/02/2026, 20:03:16
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;  // no perfect numbers <= 1
        
        int sum = 0;  // 1 is always a divisor
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
}