class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap();        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }      
        /*
        PriorityQueue <Character> pQ = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        for (char c : map.keySet()) {
            pQ.offer(c);
        }
        
        StringBuilder sb = new StringBuilder();       
        while (!pQ.isEmpty()) {
            char c = pQ.poll();
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }    
        */
        List<Character> chars = new ArrayList(map.keySet());
	    Collections.sort(chars, (a, b) -> (map.get(b) - map.get(a)));
	    StringBuilder sb = new StringBuilder();
	    for (Object c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}