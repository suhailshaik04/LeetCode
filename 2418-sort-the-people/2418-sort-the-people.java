class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        int k=0;    
        String[] res=new String[n];        
        HashMap<Integer,String> map=new HashMap<>();        
        for(int i=0;i<n;i++)
            map.put(heights[i],names[i]);  
        Arrays.sort(heights);    
        for(int i=heights.length-1;i>=0;i--)
        {
            res[k]=map.get(heights[i]);
            k++;
        }             
        return res;   
    }
}