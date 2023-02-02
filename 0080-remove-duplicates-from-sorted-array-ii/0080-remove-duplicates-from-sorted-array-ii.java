class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 0;
        int j = 1;
        int count = 1;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                count = 1;
                j++;
                continue;
            }
            else if (count > 1) continue;
            nums[j] = nums[i];
            count++;
            j++;
        }
        return j;  
    }
}