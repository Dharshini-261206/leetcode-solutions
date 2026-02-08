// Last updated: 08/02/2026, 20:04:37
class Solution {
    public int maxProfit(int[] prices) {

           int maxp=0;
           int bp=prices[0];
           for(int i=1;i<prices.length;i++){
            int sp=prices[i];
               if(sp>bp){
                int profit= sp-bp;
                if(maxp<profit){
                    maxp=profit;
                }
               }else{
                bp=prices[i];
               }
           }
               return maxp;
    
        }
    
    }
