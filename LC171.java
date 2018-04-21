class LC171 {
    public int titleToNumber(String s) {
        if (s == null || s.length()==0)
            return 0;
        int res = 0;
        int n = s.length()-1;
        int c = 0;
        while (n >= 0) {
            res = res + (s.charAt(n)-'A'+1)*(int)Math.pow(26,c);
            c++;
            n--;
        }
        return res;
        
    }
}