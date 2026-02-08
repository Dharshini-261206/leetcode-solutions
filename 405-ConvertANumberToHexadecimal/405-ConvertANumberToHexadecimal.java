// Last updated: 08/02/2026, 20:03:51

class Solution {
    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        
        if (num == 0) return "0";
        
        StringBuffer sb = new StringBuffer();
        
        while (num != 0) {
            int d = num & 15; // extract last 4 bits
            sb.append(map[d]);
            num >>>= 4; // unsigned right shift
        }
        
        return sb.reverse().toString();
    }
}