class Solution {
    public int countTriplets(int[] arr) {
        int i = 0;
        int count = 0;
        int n = arr.length;
        while(i < n){
            int xor = arr[i];
            int k = i + 1;
            while(k < n){
                xor = (xor ^ arr[k]);
                if(xor == 0){
                    count += (k - i);
                }
                k++;
            }
            i++;
        }
        return count;
    }
}