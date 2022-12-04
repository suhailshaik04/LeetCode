class Solution {
   public int arithmeticTriplets(int[] arr, int key) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) map.put(arr[i],i);
        for(int k : arr) count += (map.containsKey(k+key) && map.containsKey(k+2*key)) ? 1 : 0;
        return count;
    }
}