// Last updated: 08/02/2026, 20:02:23
class Solution {
    public String winningPlayer(int x, int y) {
        int moves;
      int a= y/4;
      if(a<x){
         moves=a;
      }
      else{
         moves=x;
      }
      if(moves%2==0){
        return "Bob";
      }  
      else{
        return "Alice";
      }
    }
}