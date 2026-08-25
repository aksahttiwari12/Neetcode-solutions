class Solution {
    public int reverse(int x) {
        return helper(x,0);
    }
    private int helper(int n,int rev){
        if(n == 0){
            return rev;
        }
        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
            return 0;
        }
        int rem = n%10;
        return helper(n/10,rev*10+rem);
    }
}