class LC67 {
    public String addBinary(String a, String b) {
        if (a.length()>b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int m = a.length();
        int n = b.length();
        char[] res = new char[b.length()+1];
        int c = 0;
        for (int i=1; i<=m; i++) {
            int num  = (a.charAt(m-i)-'0') + (b.charAt(n-i)-'0') + c;
            res[res.length-i] = (char)(num%2 + (int)'0');
            c = num/2;
        }
        for (int i=m+1; i<=n; i++) {
            int num  = (b.charAt(n-i)-'0') + c;
            res[res.length-i] = (char)(num%2 + (int)'0');
            c = num/2;
        }
        if (c!=0) {
            res[0] = '1';
            return new String(res);
        }
        else {
            StringBuilder sb = new StringBuilder();
            for (int i=1; i<res.length; i++)
                sb.append(res[i]);
            return sb.toString();
        }
    }
}