class Solution {
    public int reinitializePermutation(int n) {
        if(n == 2) return 1;
        int midIndex = n / 2;
        int operationCount = 1;
        int nextIndex = midIndex;
        while(nextIndex!= 1) {
            if(nextIndex % 2 == 0) nextIndex = nextIndex / 2;
            else nextIndex = midIndex + (nextIndex - 1) / 2;
            operationCount++;
        }
        return operationCount;
    }
}