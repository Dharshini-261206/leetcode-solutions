// Last updated: 08/02/2026, 20:03:14
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s =new Stack();
        int [] res = new int[temp.length];
        int n =temp.length;
        int count=0;
        for(int i=0;i<n;i++){                                                                           
            while(!s.empty()&&temp[i]>temp[s.peek()]){
                res[s.peek()]=i-s.peek();
                s.pop();

            }
            s.push(i);
        }
        return res;
    }
}