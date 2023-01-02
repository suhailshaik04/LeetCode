class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=2;i<=300;i++){
            if(i%2==0 && i%n==0){
                return i;
            }
        }
        return 0;
    }
}