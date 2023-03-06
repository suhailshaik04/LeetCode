class Solution {
    public int findKthPositive(int[] arr, int k) {
        if (k<arr[0]) return k;
        if (k+arr.length>arr[arr.length - 1]) return k + arr.length;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left + 1 < right) {
            mid = left + (right - left) / 2;
            if (mid + k >= arr[mid]) left = mid; 
            else right = mid;
        }
        return k + left + 1;
    }
}