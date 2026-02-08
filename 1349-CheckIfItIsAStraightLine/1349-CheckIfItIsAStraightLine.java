// Last updated: 08/02/2026, 20:03:04
class Solution {
    public boolean checkStraightLine(int[][] co) {
        int x0 = co[0][0], y0 = co[0][1];
        int x1 = co[1][0], y1 = co[1][1];

        int dx = x1 - x0;
        int dy = y1 - y0;

        for (int i = 2; i < co.length; i++) {
            int x2 = co[i][0], y2 = co[i][1];
            // Check slope consistency using cross multiplication
            if ((y2 - y0) * dx != (x2 - x0) * dy) {
                return false;
            }
        }
        return true;
    }
}