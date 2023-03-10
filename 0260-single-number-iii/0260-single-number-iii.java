class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums)xor^=i;
        int lB = xor & (-xor);
        int [] ans = new int[2];
        for(int i : nums){
            if((lB & i) == 0) ans[0] ^= i;
            else ans[1] ^= i;  
        }
      return ans;  
    }
}