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
        /*
        We know that if we shift the number by 1 to the right, all the ones will become zeros and vice versa. 
        Now if we AND those two numbers, we can get the whole thing as zero but that won't work for numbers like 2, 4, 8... 
        So we will take another approach. Instead of AND we will do an XOR .
        This will make all bits 1. Now we need to check if all the bits are 1.
        The best way to do that is AND the number by (number+1) . It'll give you zero.
        */
        /*
        n = n ^ (n>>1);
        return (n & n+1) == 0;
        */
    }
}
