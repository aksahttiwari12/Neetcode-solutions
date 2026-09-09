class Solution {
    public long countCommas(long n) {
        long totalcommas = 0;
        long threshold = 1000;
        while(n>=threshold){
            totalcommas += (n-threshold+1);
            threshold*=1000;
        }
        return totalcommas;
    }
}