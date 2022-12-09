class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*
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
        */
        if(strs.length<1) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!= 0)
            prefix = prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }
}