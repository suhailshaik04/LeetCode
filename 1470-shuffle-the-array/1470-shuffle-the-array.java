class Solution {
     public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = n;

        for (int i = 1; i < nums.length; i += 2) {
            result[i - 1] = nums[left];
            result[i] = nums[right];
            left++;
            right++;
        }
        return result;
    }
}