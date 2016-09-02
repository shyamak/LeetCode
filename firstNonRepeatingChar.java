public char firstNonRepeatingChar(String a) {
	
	//construct map
	HashMap<Character, Integer> map = new HashMap<>();
	for (int i=0; i<a.length(); ++i) {
		char p = a.charAt(i);
		if (map.containsKey(p))
			map.put(p, map.get(p)+1);
		else
			map.put(p, 1);
	}

	for (int i=0; i<a.length(); ++i) {
		char p = a.charAt(i);
		if (map.get(p)==1)
			return p;
	}
}