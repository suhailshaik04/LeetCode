class Solution {
    public int numberOfArrays(String s, int k) {
        int n=s.length(),mod =1000000007, m[]=new int[n+1];
        m[n]=1;
    for(int i=n-1;i>=0;i--){
        if(s.charAt(i)=='0'){
            m[i]=0;
            continue;
        }
        long res=0;
        for (int j = i; j < n; j++) {
            res=res*10+(s.charAt(j)-'0');
            if(res>k) break;  
            m[i]=(m[i]+m[j+1])%mod;
        }
    }
    return m[0];
    }
}