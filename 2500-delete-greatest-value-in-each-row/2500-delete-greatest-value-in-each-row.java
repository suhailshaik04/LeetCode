class Solution {
    public int deleteGreatestValue(int[][] arr) {
       for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        
            for (int j = arr[0].length-1; j >= 0 ; j--) {
                for (int i = 0; i < arr.length; i++) {
                    if(max < arr[i][j]){
                        max = arr[i][j];
                    }
                }
                sum = sum + max;
                max = Integer.MIN_VALUE;
            }

        return sum; 
    }
}