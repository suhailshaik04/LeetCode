class Solution {
    public String reverseWords(String s) {
        String[] arr = s.replaceAll("\\s+"," ").trim().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
                ans.append(arr[i]);
                ans.append(" ");
            }
        return ans.toString().trim();
    }
}