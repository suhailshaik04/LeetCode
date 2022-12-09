class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==1) return strs[0];
        char []arr = strs[0].toCharArray();
        String ans = "";
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<strs.length;j++){
                if(arr[i]==strs[j].charAt(i)){
                    if(j==strs.length-1) ans += arr[i];
                }
                else{
                    if(ans.length()==0) return "";
                    else return ans;
                }
            }
        }
        return ans;
    }
}