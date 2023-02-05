class Solution {
     public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int lenS = s.length();
        int lenP = p.length();
        if (lenP > lenS) return res;
        int left = 0;
        int right = 0;
        int counter = lenP;
        int[] freq = new int[26];
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        while (right < lenS) {
            char rch = s.charAt(right);
            if (freq[rch - 'a'] > 0) counter--;
            freq[rch - 'a']--;
            if (right - left + 1 == lenP) {
                if (counter == 0) res.add(left);
                char lch = s.charAt(left);
                if (freq[lch - 'a'] >= 0) counter++;
                freq[lch - 'a']++;
                left++;
            }
            right++;
        }
        
        return res;
    }
}