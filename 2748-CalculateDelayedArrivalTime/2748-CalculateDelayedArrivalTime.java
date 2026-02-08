// Last updated: 08/02/2026, 20:02:27
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a;
        a=arrivalTime+delayedTime;
        if(a==24){
            return 0;
        }
        else if(a>24){
            int h=a-24;
            return h;
        }
        else{
            return a;

        }
        
    }
}