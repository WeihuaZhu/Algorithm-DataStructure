class LC357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 10;
        int res = 10;
        int temp = 9;
        int multi = 9*temp;
        for (int i=2; i<=n; i++) {
            res += multi;
            if (temp>1)
                temp--;
            multi = multi * temp;            
        }
        return res;
    }
}