class Solution {
   public int countGoodRectangles(int[][] arr) {
        int[] sq = new int[arr.length];
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            if(arr[i][0]<arr[i][1]){
                sq[i]=arr[i][0];
            }
            else{
                sq[i]=arr[i][1];
            }
        }
        int max = Largest(sq,m,0);
        int count =0;
        for(int i=0;i<m;i++){
            if(max==sq[i]){
                count+=1;
            }
        }
        return count;
    }

    public static int Largest(int [] sq, int m, int i){
        if(i==m-1){
            return sq[i];
        }
        int large=Largest(sq,m,i+1);
        return Math.max(large,sq[i]);
    }
}