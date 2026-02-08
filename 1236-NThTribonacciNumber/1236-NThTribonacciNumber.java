// Last updated: 08/02/2026, 20:03:07
class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int a=0,b=1,c=1,tri=0;
        for(int i=3;i<=n;i++){
            tri=a+b+c;
            a=b;
            b=c;
            c=tri;
        }
        return tri;
    }
}