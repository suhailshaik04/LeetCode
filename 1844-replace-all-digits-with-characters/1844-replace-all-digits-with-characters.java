class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i=1; i<str.length(); i+=2){
            int j = str.charAt(i)-'0';
            str.setCharAt(i, (char)(str.charAt(i-1)+j));
        }
        return str.toString();
    }
}