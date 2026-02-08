// Last updated: 08/02/2026, 20:03:05
class Solution {
    public int minCostToMoveChips(int[] pos) {
     int oddcount=0;
     int evencount=0;
     for(int p:pos){
        if(p%2==0){
            evencount++;
        }         
        else{
            oddcount++;
        }              
     }
       return evencount<oddcount?evencount:oddcount;      
    }
}                                                                    