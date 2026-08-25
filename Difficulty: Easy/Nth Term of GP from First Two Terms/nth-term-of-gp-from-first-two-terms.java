class Solution {
    public int termOfGP(int a, int b, int n) {
        // code here
        double  r = (double) b / a;
        
        int nthterm = (int) (a * Math.pow(r, n-1));
        
        return nthterm;
        
        
    }
}