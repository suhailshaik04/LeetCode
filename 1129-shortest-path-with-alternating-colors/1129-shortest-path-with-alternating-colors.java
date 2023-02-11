class Solution {
   public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {    
        List<Integer> adj1[] = new ArrayList [n]; 
        List<Integer> adj2[] = new ArrayList [n];
        for(int i=0;i<n;i++){
            adj1[i] = new ArrayList<>();
            adj2[i] = new ArrayList<>();
        }
        for(int edge[] : redEdges){
            adj1[edge[0]].add(edge[1]);
        }
        for(int edge[] : blueEdges){
            adj2[edge[0]].add(edge[1]);
        }
        
        int res[] = new int [n];
        boolean visited1[] = new boolean [n];
        boolean visited2[] = new boolean [n];
        Arrays.fill(res , -1);
        visited1[0] = true;
        visited2[0] = true;
        
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0,0});
        int dist = 0;
        
        while(!que.isEmpty()){
            int size = que.size();
            while(size-- > 0){
                int p[] = que.poll();
                int node = p[0];
                int color = p[1];
                res[node] = res[node]==-1?dist:res[node];
                if(color != 1){
					for(int neighbor : adj1[node]){
                        if(!visited1[neighbor]){
                            que.add(new int[]{neighbor , 1 });
                            visited1[neighbor] = true;
                        }
                    }
                }
                if(color != -1){
                    for(int neighbor : adj2[node]){
                        if(!visited2[neighbor]){
                            que.add(new int[]{neighbor , -1 });
                            visited2[neighbor] = true;
                        }
                    }
                }
                
            }
            dist++;
        }
        
        return res;
    }

}