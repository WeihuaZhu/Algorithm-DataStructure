class LC811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> count = new HashMap<>();
        for (String str: cpdomains) {
            String[] item = str.split(" ");
            int c = Integer.valueOf(item[0]);
            String word = item[1];
            for (int i = word.length()-1; i>=0; i--) {
                if (word.charAt(i) == '.') {
                    count.put(word.substring(i+1), count.getOrDefault(word.substring(i+1),0)+c);
                }
            }
            count.put(word, count.getOrDefault(word,0)+ c);
        }
        
        for (String key: count.keySet()) {
            String temp = String.valueOf(count.get(key)) + " " + key;
            res.add(temp);
            
        }
        return res;
        
    }
}