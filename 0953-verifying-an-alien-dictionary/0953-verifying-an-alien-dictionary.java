class Solution {
    int[] arr = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<order.length(); i++){
            arr[order.charAt(i) - 'a'] = i;
        }
        for(int i=0; i< words.length-1; i++){
            if(compare(words[i], words[i+1])) return false;
        }
        return true;
    }

    boolean compare(String s1, String s2){
        for(int i=0; i<s1.length() && i<s2.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return arr[s1.charAt(i) - 'a'] > arr[s2.charAt(i) - 'a'];
            }
        }
        return s1.length() > s2.length();
    }
}