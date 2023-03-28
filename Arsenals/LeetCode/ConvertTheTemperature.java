class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp = new double[2];
        temp[0] = celsius + 273.15;
        temp[1] = celsius * 1.80 + 32.00;

        return temp;
    }
}