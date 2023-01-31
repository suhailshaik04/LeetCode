class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0,idx = 0;;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == pivot)count++;
            if(nums[i] < pivot) arr[idx++] = nums[i];
        }
        while(count > 0){
            arr[idx++] = pivot;
            count--;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > pivot) arr[idx++] = nums[i];
        }
        return arr;
    }
}