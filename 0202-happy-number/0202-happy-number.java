class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while (n >= 7){ 
            while (n > 0){
                int temp = n % 10;
                sum = sum + (temp * temp);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1)
            return true;
       
        return false;
    }
}