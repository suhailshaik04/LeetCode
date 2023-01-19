class Solution {
    public int trailingZeroes(int n) {
         if (n < 0) return -1;
	     int output = 0;
	    for (long idx = 5; n/idx >= 1; idx *= 5) {
		    output += n/idx;
	    }
        return output;
    }
}