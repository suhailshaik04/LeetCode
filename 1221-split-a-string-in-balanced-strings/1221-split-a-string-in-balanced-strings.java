class Solution {
    public int balancedStringSplit(String s) {
        /*
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
        */
        int count = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L') count++;
            else count--;
            if(count == 0) ans++;
        }
        return ans;
    }
}