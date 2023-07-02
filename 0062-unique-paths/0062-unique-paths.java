class Solution {
    //Using Recurssion 
    // public int uniquePaths(int m, int n) {
    //     int i=0,j=0;
    //     return countUniquepaths(i,j,m,n);
    // }
    // public int countUniquepaths(int i,int j, int m, int n){
    //     if(i==m-1 && j==n-1) return 1;
    //     if(i>=m || j>=n) return 0;        
    //     else return countUniquepaths(i+1,j,m,n) + countUniquepaths(i,j+1,m,n);
    // }
    //Using memoization
    public int uniquePaths(int m, int n) {
        int i=0,j=0;
        int[][] table = new int[m][n];
        for (int p = 0; p < m; p++) {
            for (int k = 0; k < n; k++) {
                 table[p][k] = -1;
            }
        }
        return countUniquepaths(i,j,m,n,table);
    }
    public int countUniquepaths(int i,int j, int m, int n, int[][] table){
        if(i==m-1 && j==n-1) return 1;
        if(i>=m || j>=n) return 0;  
        if(table[i][j] !=-1) return table[i][j];
        else return table[i][j] = countUniquepaths(i+1,j,m,n,table) + countUniquepaths(i,j+1,m,n,table);
    }
}