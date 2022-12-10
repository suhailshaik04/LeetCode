class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         String[] result = new String[names.length];
        TreeMap <Integer,String > map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        int i = 0;
        for (int h: map.keySet()) {
            result[i++] = map.get(h);
        }
        return result;
    }
}