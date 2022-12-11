class Solution {
    public boolean isPowerOfFour(int n) {
        /*
        Approach-1
        For a number to be power of 4 it needs to follow two conditions
        1. It always has one set bit only
        2. It has even no of 0's always
        Condition 1 is true because 4^x==((2)^2)^x, that is power of 4 can always be converted into power of 2
        and binary representation of power's of 2 has 1 set bit only.
        */
       int setBit=0;  
       int unsetBit=0;
        while(n>0){
            if((n&1)==0) unsetBit++;
            else setBit++;
            n=n>>1;
        }
        if(setBit==1 && (unsetBit%2==0)) return true;
        return false;
        /*
        Approach - 2
        //Naive Way
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 4 != 0) return false;
        return isPowerOfFour(n/4);  
        */
        /*
        Approach -3
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position 
        */
}
}