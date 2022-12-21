class Solution {
    public List<String> cellsInRange(String s) {
        String[] str = s.split(":");

        List < String > res = new ArrayList < > ();
        int a = Character.getNumericValue(str[0].charAt(1));
        int b = Character.getNumericValue(str[1].charAt(1));
        int c1 = str[0].charAt(0) - 'A';
        int c2 = str[1].charAt(0) - 'A';

        for (int i = c1; i <= c2; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toString(i + 65));
            for (int j = a; j <= b; j++) {
                sb.append(j);

                res.add(sb.toString());

                sb = sb.deleteCharAt(sb.length() - 1);
            }
        }

        return res;
    }
}