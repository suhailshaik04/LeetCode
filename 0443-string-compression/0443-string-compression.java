class Solution {
    public int compress(char[] chars) {
        int fast = 0, slow = 0;
        while (fast < chars.length) {
            char cur = chars[fast];
            int count = 0;
            while (fast < chars.length && chars[fast] == cur) {
                fast++;
                count++;
            }
            chars[slow++] = cur;
            if (count > 1) {
                int start = slow;
                while (count > 0) {
                    int digit = count % 10;
                    chars[slow++] = (char)('0' + digit);
                    count /= 10;
                }
                reverse(chars, start, slow - 1);
            }
        }
        return slow;
    }
    private void reverse(char[] a, int i, int j) {
        for (; i < j; i++, j--) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}