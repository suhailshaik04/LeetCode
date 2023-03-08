class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(h == 1000000000) return 3;
        int max = max(piles);
        int low = 1;
        while(low <= max){
           int k = low + ((max - low)/2);
           if(helper(piles , k , h)) max = k-1; 
           else low = k+1;
        }
        return low;
    }
    boolean helper(int[] piles , int k , int h){
        int count  = 0;
        for(int i : piles){
          count += i/k;
          if(i%k != 0) count++;
        }
        return count <= h;
    }
    int max(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(max , i);
        }
        return max;
    }
}