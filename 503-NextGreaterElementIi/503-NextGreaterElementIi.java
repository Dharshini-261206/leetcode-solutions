// Last updated: 08/02/2026, 20:03:43
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack();
        int[] res = new int[nums.length];
        int n=nums.length;
        Arrays.fill(res,-1);
        for(int i=0;i<n*2;i++){
            int x =nums[i%n];
            while(s.empty()==false&&x>nums[s.peek()]){
                res[s.peek()]=x;
                s.pop();
            }
            s.push(i%n);
        }
        return res;
    }
}