class Solution {
    public int reverse(int n) {
        //String str = String.toBinaryInteger(n);
        if(n>= Integer.MAX_VALUE || n<=Integer.MIN_VALUE) return 0;
        int num = n;   
        if(num<0){
            n=n*(-1); 
        }
        long rev=0;
        while(n > 0) {
            long digit=n%10;
            rev = rev*10 + digit;
            n/=10;

          if(rev>= Integer.MAX_VALUE) return 0;
        }
       if(num<0) rev=rev*(-1);
        return (int)rev; 
    }
}