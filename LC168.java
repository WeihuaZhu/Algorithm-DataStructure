class LC168 {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        
        while (n > 0) {
            s.append((char)('A' + (n-1)%26));
            n = (n-1)/26;            
        }
        String x = s.toString();
        StringBuilder res = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            res.append(x.charAt(i));
        }
        return res.toString();
    }
    
}