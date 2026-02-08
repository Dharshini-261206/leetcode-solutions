// Last updated: 08/02/2026, 20:02:20
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int rem;
        int copy=x;
        while(copy!=0){
            rem = copy%10;
            sum+=rem;
            copy/=10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}