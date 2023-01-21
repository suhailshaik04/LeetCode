class Solution {
    public int differenceOfSum(int[] nums) {
        int r=0,sum1=0,sum2=0,x=0;
        for(int i=0;i<nums.length;i++){
            x=nums[i];
            sum1+=nums[i];
            while(x>0){
                r=x%10;
                sum2+=r;
                x=x/10;
            }
        }
        return Math.abs(sum1-sum2);
    }
}