class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max=matrix[0][0];
        int row=0,col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        return new int[]{row,col};
    }
}