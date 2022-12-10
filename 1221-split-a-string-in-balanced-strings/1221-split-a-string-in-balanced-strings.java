class Solution {
    public int balancedStringSplit(String s) {
        /*
        int ans =0;
        int count =1;
        char tar;
         if(s.charAt(0)=='L') tar = 'R';
         else tar ='L';
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==tar){
                count--;
                if(count==0) ans++;
            }
            else count++;
        }
        return ans;
        */
        int ans=0;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && st.peek()!=s.charAt(i)){
                st.pop();
                if(st.isEmpty()) ans++;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return ans;
    }
}