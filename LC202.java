class LC202 {
    public boolean isHappy(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        HashSet<Integer> memo = new HashSet<>();
        memo.add(n);
        while (n != 1) {
            n = computeSquare(n);
            if (memo.contains(n))
                return false;
            else
                memo.add(n);
        }
        return true;
        
    }
    
    public int computeSquare(int num) {
        int score = 0;
        while (num > 0) {
            score += (num%10)*(num%10);
            num = num/10;
        }
        return score;
    }
}