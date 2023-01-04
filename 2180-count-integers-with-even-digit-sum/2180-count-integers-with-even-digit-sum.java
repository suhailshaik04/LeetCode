class Solution {
    public int countEven(int num) {
        /*
         int count = 0,sum = 0;
        for (int i = 2; i <= num; i++) {
            int n = i;
            while (n!=0) {
                int rem = n% 10;
                sum = sum + rem;
                n = n/10;
            }
            if(sum % 2 == 0) count++;
            sum = 0;
        }
        return count;
        */
        int temp=num;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum%2==0 ? temp/2 : (temp-1)/2;
    }
}