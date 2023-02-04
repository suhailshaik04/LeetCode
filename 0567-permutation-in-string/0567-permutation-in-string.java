class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] counts = new int[26];
        for (char c: s1.toCharArray()) {
            counts[c - 'a']++;
        }
        int subCount = 0;
        for (int i = 0; i < s2.length(); i++) {
            int p = s2.charAt(i) - 'a';
            int j = i - subCount;
            while (j <= i && counts[p] == 0) {
                counts[s2.charAt(j++) - 'a']++;
                subCount--;
            }
            if (counts[p] != 0) {
                counts[p]--;
                subCount++;
            }
            if (subCount == s1.length()) return true;
        }
        return false;
    }
}