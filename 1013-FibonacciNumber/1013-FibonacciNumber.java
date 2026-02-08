// Last updated: 08/02/2026, 20:03:11
class Solution {
    public int fib(int n) {
          if(n==0){ return 0;}        
        if(n==1){
           return 1;
        }
      
        int a=0,b=1,fibo=0;
        for(int i=1;i<n;i++){
            fibo=a+b;
            a=b;
            b=fibo;
           

        }
        return fibo;
    }
}