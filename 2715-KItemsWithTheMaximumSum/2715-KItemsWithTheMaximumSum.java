// Last updated: 08/02/2026, 20:02:28
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         if (k <= numOnes) {
            return k;
        }
        
        // Case 2: If we pick all 1s and the rest can be filled with 0s
        if (k <=numOnes+numZeros ) 
            return numOnes;
        int negneeded = k-(numOnes+numZeros);
    
        return numOnes - negneeded;

        
    }
}