class Solution {
    public int subtractProductAndSum(int n) {
        long sum=0;
        long prd=1;
        while(n>0)
        {
            int res=n%10;
            sum+=res;
            prd*=res;
            n/=10;
        }
        return (int)(prd-sum);
    }
}