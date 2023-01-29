class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
            if(!numberSystems(n,i)) return false;
        }
    
    return true;
    }
    public static boolean numberSystems(int n,int k){
        StringBuilder res=new StringBuilder();
        while(n!=0){
            int q=n%k;
            res.append(Integer.toString(q));
            n/=k;
        }
        int m=res.length();
        for (int i=0; i<m; i++){
            if (res.charAt(i) != res.charAt(m-1-i)) return false;
        }
        return true;
    }
}