class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==3) return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);        
        int result  = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i=0;i+2<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                int mid = j + ((k- j)/2);
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>target){
                    if(mid!=k && nums[i]+nums[j]+nums[mid] >= target) k = mid;
                    else{
                        k--;
                        while(j<k && nums[k] == nums[k+1]) k--;
                    }
                }
                else if(sum<target){
                    if(mid!=j && nums[i]+nums[mid]+nums[k] <= target) j = mid;
                    else{
                        j++;
                        while(j<k && nums[j] == nums[j-1]) j++;
                    }
                    
                }
                if(Math.abs(sum-target) < Math.abs(result-target)) result = sum; 
                if(result == target){
                    i=nums.length;
                    break;
                }
            }
        }  
        return result;
    }  
}