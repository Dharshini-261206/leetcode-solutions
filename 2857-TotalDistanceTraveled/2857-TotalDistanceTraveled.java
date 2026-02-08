// Last updated: 08/02/2026, 20:02:21
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int tank=0;
        while(mainTank>=5){
             tank+=50;
             mainTank-=5;
             if(additionalTank>=1){
            mainTank++;
            additionalTank--;
             }
            
        }
        
             return tank+(mainTank*10);
    }
}