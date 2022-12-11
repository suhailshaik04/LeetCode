class Solution {
    /*
     public int countPrimeSetBits(int left, int right) {
        int count = 0;
        while (left <= right) {
            int bit = findSetBits(left);
            if (isPrime(bit)) count++;
            left++;
        }
        return count;
    }
    private int findSetBits(int x) {
       int count = 0;
        while(x > 0)
        {
            int z = (x&1);
            if(z==1) ++count;
            x >>>= 1;
        }
        return count;
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    */
   public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int x = L; x <= R; ++x){
            if (isPrime(Integer.bitCount(x)))ans++;
        }
        return ans;
    }
    public boolean isPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||x == 11 || x == 13 || x == 17 || x == 19);
    }
}