class LC66 {
    public int[] plusOne(int[] digits) {
        
        
        
        int trans = 1;        
        for (int i = digits.length-1; i >= 0; i--) {
            if (trans == 0)
                return digits;
            
            int temp = digits[i];
            digits[i] = (digits[i] + trans) % 10;
            trans = (temp + trans) / 10;
        }
        
        if (trans == 0)
            return digits;
        else {
            int[] out = new int[digits.length + 1];
            out[0] = 1;
            for (int i=1; i<out.length; i++) {
                out[i] = digits[i-1];
            }
            return out;
            
        }
        
    }
}