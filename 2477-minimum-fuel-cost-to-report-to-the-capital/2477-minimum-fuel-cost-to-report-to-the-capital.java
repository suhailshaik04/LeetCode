class Solution {
    long ans = 0l;
    public long minimumFuelCost(int[][] roads, int seats) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = roads.length+1;
        ans = 0l;
        for(int i = 0  ; i<n ; i++) adj.add(new ArrayList<>());
        for(int a[] : roads){
            adj.get(a[0]).add(a[1]);
            adj.get(a[1]).add(a[0]);
        }
        solve(adj, seats, 0 , -1);
        return ans;
    }

    long solve(ArrayList<ArrayList<Integer>> adj, int seats, int src, int parent){
        int people = 1;
        for( int i : adj.get(src) ){
            if(i!=parent) people+=solve(adj, seats, i, src);
        }
        if(src!=0) ans+=(long)Math.ceil((double)people/seats);
        return people;

    }
}