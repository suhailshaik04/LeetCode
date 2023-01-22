class Solution {
   public int countGoodNumbers(long n) {
        long oddInds = n>>1;
        long evenInds = (n+1)>>1;
        int mod = 1000000007;
        long oddPow = pow(4,oddInds, mod);
        long evePow = pow(5, evenInds, mod);
        long ans = (oddPow*evePow) %mod;
        return (int)ans;
    }
    public long pow(int x, long p, int m) {
        if(p == 0) return 1L;
        long ans = pow(x, p>>1, m);       
        if((p&1)==1) return (ans * ans * x) % m;
        return (ans * ans) % m;   
    }
	
}