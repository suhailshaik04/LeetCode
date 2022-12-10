class Solution {
    public String greatestLetter(String s) {
        char up = 'Z';
        char lo = 'z';
        for(int i = 0; i < 26; i++){
            if(s.contains(Character.toString(up)) && s.contains(Character.toString(lo))){
                return Character.toString(up);
            }
            up--;
            lo--;
        }
        return "";
    }
}