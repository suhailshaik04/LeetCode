public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        /*
        int count=0;
        String str1 = Integer.toBinaryString(n);
        for (char c: str1.toCharArray()){
            if(c=='1') count++;
        }
        return count;
        */
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}