class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int counter=1;
        for(int i=0;i<n && i<target.length;){
            if(counter==target[i]){
                res.add("Push");
                counter++;
                i++;
            }else{
                res.add("Push");
                res.add("Pop");
                counter++;
            }
        }
        return res;
    }
}