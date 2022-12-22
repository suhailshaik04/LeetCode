class Solution {
    public int[] sortByBits(int[] arr) {
         List<List<Integer>> pq = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> a = new ArrayList<>();
            a.add(Integer.bitCount(arr[i]));
            a.add(arr[i]);
            pq.add(a);
        }
        pq.sort((x, y) -> {
            for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                if (x.get(i) != y.get(i)) {
                    return x.get(i) - y.get(i);
                }
            }
            return x.size() - y.size();
        });
        //Collections.sort(pq);
        int k=0;
        for(int i=0;i<pq.size();i++){
            arr[k++] = (int)pq.get(i).get(1);
        }
        return arr;
    }
}