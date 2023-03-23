class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) nums[i] = 0;
        }
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(index >= 0 && index < nums.length) {
                if (nums[index] == 0) nums[index] = -1*(nums.length+1);
                else if(nums[index] > 0) nums[index] = -nums[index];
            }
            
        }
        int count = 0;
        for(count=1; count<nums.length+1; count++) {
            if(nums[count-1] >= 0) return count;
        }
        return count;
    }
}