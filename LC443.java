class LC443 {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int size = 0;
        while (j < chars.length) {
            int count = 1;
            while (j < chars.length-1 && chars[j+1] == chars[j]) {
                count++;
                j++;
            }
            chars[i] = chars[j];
            i++;
            if (count > 1) {
                String num = String.valueOf(count);
                for (char c: num.toCharArray())
                    chars[i++] = c;
                
            }
            j++;
            
        }
        return i;
    }
}