class Solution {
    int sumOfSeries(int n) {
        // code here
       long sum = (long)n * (n + 1) / 2;
       return (int)(sum * sum);
    }
}