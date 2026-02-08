// Last updated: 08/02/2026, 20:04:45
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copy=x;
        int count=0;
        while(copy!=0){
            int rem = copy%10;
            count=(count*10)+rem;
            copy=copy/10;
        }
        if(count==x){
            return true;
        }
        else{
            return false;
        }

        }
    }
