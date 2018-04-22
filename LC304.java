class LC304 {
    int[][] presum;
    public NumMatrix(int[][] matrix) {
        if (matrix != null && matrix.length != 0 && matrix[0].length != 0) {
            int m = matrix.length;
            int n = matrix[0].length;
            presum = new int[m][n];
            for (int i=0; i<m; i++)
                presum[i][0] = matrix[i][0];
            for (int i=0; i<m; i++)
                for (int j=1; j<n; j++)
                    presum[i][j] = matrix[i][j] + presum[i][j-1];
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        if (col1 == 0) {
            for (int i = row1; i<= row2; i++)
                res += presum[i][col2];
        }
        else {
            for (int i = row1; i<= row2; i++)
                res += (presum[i][col2] - presum[i][col1-1]);
        }
            
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */