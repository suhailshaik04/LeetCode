class Solution {
     public int reverse(int n){
        int num=0;
        while(n!=0){
            num=num*10+n%10;
            n=n/10;
        }
        return num;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            hs.add(reverse(nums[i]));
        }
        return hs.size();
    }
}