class Solution {
    private class Pair {
        int index, jumps;
        public Pair(int index, int jumps) {
            this.index = index;
            this.jumps = jumps;
        }
    }
    public int minJumps(int[] arr) {
        HashMap<Integer, List<Integer>> hashmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(!hashmap.containsKey(arr[i])) hashmap.put(arr[i], new ArrayList<>());
            hashmap.get(arr[i]).add(i);
        }
        
        return bfs(arr, hashmap);
    }
    
    private int bfs(int[] arr, HashMap<Integer, List<Integer>> hashmap) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        boolean[] isVisited = new boolean[arr.length];
        Pair pair = new Pair(0, 0);
        queue.add(pair);
        
        while(!queue.isEmpty()) {
            pair = queue.poll();
            if(pair.index == arr.length - 1) break;
            isVisited[pair.index] = true;
            
            if(hashmap.containsKey(arr[pair.index])) {
                for(int idx : hashmap.get(arr[pair.index])) {
                    if(idx == pair.index || isVisited[idx]) continue;
                    if(idx == arr.length - 1) return pair.jumps + 1;
                    queue.add(new Pair(idx, pair.jumps + 1));
                }
                hashmap.remove(arr[pair.index]);
            }
            
            if(pair.index + 1 < arr.length && !isVisited[pair.index + 1]) {
                if(pair.index + 1 == arr.length - 1) return pair.jumps + 1;
                queue.add(new Pair(pair.index + 1, pair.jumps + 1));
            }
            if(pair.index - 1 >= 0 && !isVisited[pair.index - 1]) queue.add(new Pair(pair.index - 1, pair.jumps + 1));
            
        }
        
        return pair.jumps;
    }
    
    
    
}