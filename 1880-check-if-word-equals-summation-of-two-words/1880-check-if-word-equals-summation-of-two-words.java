class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
	return numerical(firstWord) + numerical(secondWord) == numerical(targetWord);
    }
    private int numerical(String s){
	int n=0;
	for (int i=0;i<s.length();i++){
		n = (n*10)+(s.charAt(i)-'a');
    }
    return n;
    }
}