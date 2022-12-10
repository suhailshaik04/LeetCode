class Solution {
    public int search(int[] nums, int target) {
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(Integer key: map.keySet()){
            if(key==target) return map.get(key);
        }
        return -1;
        */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}