class LC832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0; i<A.length; i++)
            flipAndInvertRow(A[i]);
        return A;
    }
    
    private void flipAndInvertRow(int[] a) {
        int i = 0;
        int j = a.length-1;
        while (i <= j) {
            int temp = a[i] ^ 1;
            a[i] = a[j] ^ 1;
            a[j] = temp;
            i++;
            j--;
            
        }
        
    }
}