class Solution {
    public boolean hasAlternatingBits(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n&1);
        n>>=1;
        while(n>0){       
           if(st.peek()==(n&1)) return false;
           else{
               st.pop();
               st.push(n&1);
               n>>=1;
           }
       }
        return true;
    }
}