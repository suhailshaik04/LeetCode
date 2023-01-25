class Solution {
    public int findMaxScore(String[] words, int[] frequencyCharacters, int[] score, int index){
        if(index==words.length) return 0;
        int wordNotIncluded = findMaxScore(words, frequencyCharacters, score, index+1);
        int wordScore = 0;
        boolean flag = true;
        String word = words[index];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(frequencyCharacters[ch-'a']==0) flag = false;    
            frequencyCharacters[ch-'a']--;
            wordScore += score[ch-'a'];
        }
        int wordIncluded = 0;
        if(flag==true) wordIncluded = wordScore + findMaxScore(words, frequencyCharacters, score, index+1);
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            frequencyCharacters[ch-'a']++;
        }
        return Math.max(wordNotIncluded, wordIncluded);
    }
    
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int [] frequencyCharacters = new int[score.length];
        for(char ch:letters){
            frequencyCharacters[ch-'a']++;
        }
        return findMaxScore(words, frequencyCharacters, score, 0);
    }
}