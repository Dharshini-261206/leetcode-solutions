// Last updated: 08/02/2026, 20:03:48
class Solution {
    public int arrangeCoins(int n) {
     int row=1;
     while(n>=row){
        n=n-row;
        row++;
     }
     return row-1;
    
    }
}