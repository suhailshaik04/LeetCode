class Solution{
public boolean isScramble(String s1, String s2) {
	return isScramble(s1, s2, new HashMap<>());
}

private boolean isScramble(String s1, String s2, Map<String, Boolean> map) {
	if (s1.equals(s2))
		return true;
	var key = s1 + "," + s2;
	if (map.containsKey(key))
		return map.get(key);
	var n = s1.length();
	for (var i = 1; i < n; i++) {
		var original = isScramble(s1.substring(0, i), s2.substring(0, i), map) && isScramble(s1.substring(i), s2.substring(i), map);
		if (original) {
			map.put(key, true);
			return true;
		}
		var flipCase = isScramble(s1.substring(0, i), s2.substring(n - i), map) && isScramble(s1.substring(i), s2.substring(0, n - i), map);
		if (flipCase) {
			map.put(key, true);
			return true;
		}
	}
	map.put(key, false);
	return false;
}
}