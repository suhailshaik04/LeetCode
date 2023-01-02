class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(helper(i)) ans.add(i);
        }
        return ans;
    }
    public static boolean helper(int n){
        int t = n;
        while(t>0){
            int x = t%10;
            if(x==0 || n%x!=0) return false;
            t = t/10;
        }
        return true;
    }
}