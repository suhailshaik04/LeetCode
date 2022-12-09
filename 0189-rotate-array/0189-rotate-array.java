class Solution {
    public void rotate(int[] nums, int k) {
        /*
        LinkedList<Integer> l1 = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            l1.addLast(nums[i]);
        }
        for(int i=0;i<k;i++){
            l1.addFirst(l1.removeLast());
        }
        for (int i = 0; i < l1.size(); i++) {
            nums[i] = l1.get(i);
        }
        */
        //Reverse the array
        //Split the array into two parts based on k
        //Reverse the two parts
        k =  k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int []arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}