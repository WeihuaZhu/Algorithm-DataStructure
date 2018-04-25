class LC451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (Character c: s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Character> [] bucket = new List[s.length() + 1]; //watch grammar here
        for (Character key: freq.keySet()) {
            int f = freq.get(key);
            if (bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = bucket.length-1; i>=1; i--) {
            if (bucket[i] != null) {
                for (Character item: bucket[i]) {
                    for (int j=0; j<freq.get(item); j++)
                        sb.append(item);
                    
                }                
            }
            
            
        }
        return sb.toString();
        
    }
}