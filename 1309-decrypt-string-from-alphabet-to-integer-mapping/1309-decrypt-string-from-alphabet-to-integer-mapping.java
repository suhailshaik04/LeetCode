class Solution {
    public String freqAlphabets(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()) {
            int next = s.indexOf('#', i);
            if (next >= 0)  {
                while (i < next - 2) {
                    sb.append(mapChar(s.charAt(i)));
                    i++;
                }
                sb.append(mapSubString(s.substring(next - 2, next)));
                i = next + 1;
            } else {
                sb.append(mapChar(s.charAt(i++)));
            }            
        }
        return sb.toString();
    }
    private char mapChar(char s) {
        return (char)('a' + (s - '1'));
    }
    private char mapSubString(String s) {
        int i = Integer.parseInt(s);
        return (char)('j' + (i - 10));
    }
}