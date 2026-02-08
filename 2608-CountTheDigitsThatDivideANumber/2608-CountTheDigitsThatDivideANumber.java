// Last updated: 08/02/2026, 20:02:37
class Solution {
    public int countDigits(int num) {
        int copy=num;
        int rem;
        int count=0;
        while(copy!=0){
            rem=copy%10;
            if(num%rem==0){
                count++;
            }
            copy/=10;
        }
        return count;
    }
}