class Solution {
    public int countPoints(String rings) {
        int rods[] = new int[10];
        for(int i = 0; i < rings.length(); i+=2) 
            rods[rings.charAt(i+1) - '0'] |= (1<<(rings.charAt(i) - 'A'));
        
        int count = 0;
        for(int i : rods) if(i == 131138) count++;
        return count;
    }
}