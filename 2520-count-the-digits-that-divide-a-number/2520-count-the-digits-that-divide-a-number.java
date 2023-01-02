class Solution {
    public int countDigits(int num) {
        int count=0;
        int t = num;
        while(t>0){
            if(num%(t%10)==0) count++;
            t /=10;
        }
        return count;
    }
}