class Solution {
    public int minimumAverageDifference(int[] nums) {
         long total = 0;
		for (int num : nums) {
			total += num;
		}
		int ans = -1;
		long currSum = 0;
		long averageDifference = Long.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			currSum += nums[i];
			total -= nums[i];
			long average1 = currSum / (i + 1);
			long average2 = (i + 1) < nums.length ? total / (nums.length - i - 1) : 0;
			long currAverageDifference = Math.abs(average1 - average2);
			if (averageDifference > currAverageDifference) {
				averageDifference = currAverageDifference;
				ans = i;
			}
		}
		return ans;
    }
}