// Last updated: 08/02/2026, 20:02:38
class Solution {
    public int numberOfCuts(int n) {
        int circle;
        if(n==1){
            return 0;
        }
        if(n%2==0){
            circle = n/2;
        }
        else{
            circle =n;
        }
        return circle;
    }
}
    