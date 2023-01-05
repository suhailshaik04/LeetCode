class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int temp  = num,sum=0;
        while(num>=10){
            while(temp>0){
                int x = temp%10;
                sum += x;
                temp = temp/10;
            }
            temp = sum;
            num = sum;
            sum=0;
        }
        return num;
    }
}