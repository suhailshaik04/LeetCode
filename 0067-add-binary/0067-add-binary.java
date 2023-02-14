class Solution {
    public String addBinary(String a, String b) {
        String min = a.length() >= b.length() ? b : a;
        String max = a.length() >= b.length() ? a : b;
        StringBuilder sb = new StringBuilder();
        int memo = 0;
        for (int i = 0; i < min.length(); i++) {
            char ca = max.charAt(max.length() - i - 1), ba = min.charAt(min.length() - i - 1);
            if (memo == 1) {
                if (ca == '1' && ba == '1') {
                    sb.append('1');
                } else if (ca == '0' && ba == '0') {
                    sb.append('1');
                    memo = 0;
                } else {
                    sb.append('0');
                }
            } else {
                if (ca == '1' && ba == '1') {
                    sb.append('0');
                    memo = 1;
                } else if (ca == '0' && ba == '0') {
                    sb.append('0');
                } else sb.append('1');
            }
        }

        for (int i = min.length(); i < max.length(); i++) {
            char c = max.charAt(max.length() - i - 1);
            if (memo == 1) {
                if (c == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                    memo = 0;
                }
            } else {
                sb.append(c);
            }
        }

        if (memo == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}