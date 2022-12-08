class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('|| c=='{' || c=='['){
                st.push(c);
            }
            if(c==')'){
                if(st.isEmpty()){
                    return false;
                }
                
                if(st.peek()=='('){
                    st.pop();
                }
                
                else{
                    return false;
                }
            }
            if(c=='}'){
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            if(c==']'){
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}