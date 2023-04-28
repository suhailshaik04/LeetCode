class Solution {
    public int numSimilarGroups(String[] strs) {
        Set<String> visited = new HashSet<>(); // to keep track of visited strings
        int groups = 0; // to keep track of the number of groups
        
        for (String str : strs) {
            if (visited.contains(str)) { // skip if the string has already been visited
                continue;
            }
            
            dfs(str, visited, strs); // explore the group of similar strings
            
            groups++; // increment the number of groups
        }
        
        return groups;
    }
    
    private void dfs(String str, Set<String> visited, String[] strs) {
        visited.add(str); // mark the current string as visited
        
        for (String s : strs) {
            if (visited.contains(s)) { // skip if the string has already been visited
                continue;
            }
            
            if (isSimilar(str, s)) { // if the two strings are similar, explore the group
                dfs(s, visited, strs);
            }
        }
    }
    
    private boolean isSimilar(String str1, String str2) {
        if (str1.length() != str2.length()) { // if the strings have different lengths, they are not similar
            return false;
        }
        
        int diff = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diff++;
                if (diff > 2) { // if more than two characters are different, the strings are not similar
                    return false;
                }
            }
        }
        
        return true; // if the strings have at most two different characters, they are similar
    }
}
