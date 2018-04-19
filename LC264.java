class LC264 {
    public int nthUglyNumber(int n) {
        if (n <= 0)
            return -1;
        if (n == 1)
            return 1;
        int[] data = new int[n+1];
        data[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            data[i] = Math.min(data[p2]*2, Math.min(data[p3] * 3, data[p5] * 5));
            if (data[i] == data[p2] * 2) 
                p2++;
            if (data[i] == data[p3] * 3) 
                p3++;
            if (data[i] == data[p5] * 5) 
                p5++;
        }
        return data[n];
        
    }
}