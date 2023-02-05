class Solution {
    public boolean bsearch(int[] nums, int start, int end, int key){
        if(start>end)
        return false;
        int mid = start+(end-start)/2;
        if(nums[mid]==key) return true;
        else if(nums[mid]<key)
        return bsearch(nums, mid+1, end, key);
        return bsearch(nums,start, mid-1,key);
    }

    public boolean search(int[] nums, int target) {
        int minind = 0; 
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                minind = i;
                break;
            }
        }
        return bsearch(nums, 0, minind-1, target)||bsearch(nums, minind, nums.length-1, target);
    }
}