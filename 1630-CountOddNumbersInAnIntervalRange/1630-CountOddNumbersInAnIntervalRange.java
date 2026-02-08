// Last updated: 08/02/2026, 20:03:00
class Solution {
    public int countOdds(int low, int high) {
    
        int total=(high-low+1);
        if(low%2==1 && high%2==1){
            return (total/2)+1;
        }
        return total/2;
    }
}