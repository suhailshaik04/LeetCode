class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
       
    for(int i=0;i<spells.length;i++){
        spells[i]=binarySearch(spells[i],potions,success);

    }
    return spells;
        
    }
    public int binarySearch(int num,int[] potions,long success){
        
        int left=0;
        int n=potions.length;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            if((long)num*potions[mid]<success){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        if(left==n-1){
            if((long)num*potions[left]<success){
                return 0;
            }
        }
        return n-left;

    }
}