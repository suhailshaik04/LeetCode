class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String>[] map = new HashSet[26];
        for(int i = 0; i < 26; i++){
            map[i] = new HashSet<>();
        }
        for(String idea : ideas){
            char c = idea.charAt(0);
            map[c-'a'].add(idea.substring(1)); 
        }
        
        long res = 0;
        for(int i = 0; i < 25; i++){
            for(int j = i+1; j < 26; j++){
                HashSet<String> set1 = map[i];
                HashSet<String> set2 = map[j];
                int nomore = 0;
                for(String s : set1){
                    if(set2.contains(s)){
                        nomore++;
                        
                    }
                }
                res += (set1.size() -nomore) * (set2.size()-nomore)*2;
            }
        }
        return res;
    }
}