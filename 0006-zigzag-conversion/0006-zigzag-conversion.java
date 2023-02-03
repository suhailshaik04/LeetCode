class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int i=2*(numRows-1);
        int zig=i,ind=0;
        char[] ch=new char[s.length()];
        for(int r=0;r<numRows;r++){
            for(int j=r;j<s.length();j+=i){
                ch[ind++]=s.charAt(j);
                if(r>0 && r<numRows-1 && j+zig<s.length()) ch[ind++]=s.charAt(j+zig);
            }
            zig-=2;
        }
        return new String(ch);
    }
}