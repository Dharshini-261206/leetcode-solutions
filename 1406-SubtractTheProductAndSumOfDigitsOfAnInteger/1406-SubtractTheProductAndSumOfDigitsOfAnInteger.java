// Last updated: 08/02/2026, 20:03:03
class Solution {
    public int subtractProductAndSum(int n) {
        int copy = n;
        int sum =0;
        int pro =1;
        while(copy>0){
            int rem = copy%10;
            pro = rem*pro;
            sum = rem+ sum;
            copy = copy/10;
            

        }
        return pro-sum;
    }
}