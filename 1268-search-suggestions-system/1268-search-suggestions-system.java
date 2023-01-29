class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TrieNode root = buildTrie(products);
        int i=0;
        for(i=0; i< searchWord.length(); i++) {
            char c = searchWord.charAt(i);
            if(root.childs[c-'a']==null) break;
            root = root.childs[c-'a'];
            List<String> suggestion = new ArrayList<>();
            Collections.sort(root.products);
            suggestion.add(root.products.get(0));
            if(root.products.size()>1) suggestion.add(root.products.get(1));
            if(root.products.size()>2) suggestion.add(root.products.get(2));
            result.add(suggestion);
        }
        for(;i<searchWord.length(); i++) {
            result.add(new ArrayList<>());
        }
        return result;
    }
    
    class TrieNode {
        char value;
        TrieNode[] childs;
        List<String> products;
        
        public TrieNode(final char c) {
            this.value = c;
            childs = new TrieNode[26];
            products = new ArrayList<>();
        }
    }
    public TrieNode buildTrie(String[] products) {
            TrieNode trieRoot = new TrieNode('/');
            
            for(String word : products) {
                TrieNode trie = trieRoot;
                for(char c : word.toCharArray()) {
                    if(trie.childs[c-'a']==null) trie.childs[c-'a'] = new TrieNode(c);
                    trie = trie.childs[c-'a'];
                    trie.products.add(word);
                }
            }
            return trieRoot;
        }
}