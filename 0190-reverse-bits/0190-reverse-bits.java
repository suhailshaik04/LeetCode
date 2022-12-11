public class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            /*
            left shifting of rev creates a one bit space on right and 
            that space is occupied by the last binarydigit of n
            */
            rev <<= 1; //rev = rev<<1 
            rev |= (n & 1); //rev = rev|(n&1)
            n >>= 1; //n = n>>1
        }
        return rev;
    }
}