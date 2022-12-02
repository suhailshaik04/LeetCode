class Solution {
    public int maxProfit(int[] arr) {
       /*
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
                }
            }
        }
        return maxProfit;
        */
         int maxPro = 0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            maxPro=Math.max(maxPro,arr[i]-min);
        }
        return maxPro;  
    }
}