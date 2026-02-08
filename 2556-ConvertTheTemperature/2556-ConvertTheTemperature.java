// Last updated: 08/02/2026, 20:02:41
class Solution {
    public double[] convertTemperature(double cel) {
        double[] d = new double[2];
        d[0]= cel+273.15;
        d[1]= cel*1.80+32.00;
        return d;
    }
}