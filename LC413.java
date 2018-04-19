class LC413 {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3)
            return 0;
        int prev = (A[2]-A[1] == A[1]-A[0])?1:0;
        if (A.length == 3)
            return prev;
        int res = prev; //prev means the temp count result of ending at index i
        for (int i = 3; i < A.length; i++) {
            if (prev == 0)
                prev = (A[i]-A[i-1] == A[i-1]-A[i-2])?1:0;
            else
                prev = (A[i]-A[i-1] == A[i-1]-A[i-2])?prev+1:0;
            res += prev;
        }
        return res;
    }
}