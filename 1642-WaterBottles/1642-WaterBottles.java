// Last updated: 08/02/2026, 20:02:57
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;   // total bottles you can drink
        int empty = numBottles;   // empty bottles after drinking
        
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   // exchange empties for new bottles
            total += newBottles;                   // drink them
            empty = empty % numExchange + newBottles; // leftover empties + new empties
        }
        
        return total;
    }
}