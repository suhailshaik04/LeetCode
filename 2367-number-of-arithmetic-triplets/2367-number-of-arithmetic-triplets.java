class Solution {
    public static boolean BinarySearch(int[] arr, int key){
        int low = 0 , high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==key) return true;
            else if(arr[mid]<key) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            boolean next = BinarySearch(nums,nums[i]+diff);
            boolean nextnext = BinarySearch(nums,nums[i]+2*diff);
            if(next && nextnext) count++;
        }
        return count;
    }
}