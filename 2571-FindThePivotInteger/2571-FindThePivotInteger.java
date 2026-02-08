// Last updated: 08/02/2026, 20:02:40
class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2; 
        int s=(int)Math.sqrt(total);
        if(s*s==total){
            return s;
        
        }
        else{
            return -1;
        }
    }  
}