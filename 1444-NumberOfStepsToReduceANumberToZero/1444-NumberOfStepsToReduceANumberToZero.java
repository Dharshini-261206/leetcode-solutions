// Last updated: 08/02/2026, 20:03:01
class Solution {
    public int numberOfSteps(int num) {
        int i=0;
        for( i=0;num>0;i++){
        if(num%2==0){
            num/=2;
        }
        else{
            num-=1;
        }
        
      
        }
          return i;
        

    }
}