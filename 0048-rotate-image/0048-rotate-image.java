class Solution {
    public void rotate(int[][] matrix) {
        //transpose the matrix and reverse every row
//         transpose(matrix);
//         for(int i=0; i<matrix.length;i++){
//             int start = 0;
//             int end = matrix[0].length-1;
//             while(start<end){
//                 int temp = matrix[i][start];
//                 matrix[i][start] = matrix[i][end];
//                 matrix[i][end] = temp;
//                 start++;
//                 end--;
//             }
//         }
        
//     }
//     public void transpose(int[][] matrix){
//         int rows= matrix.length;
//         int columns = matrix[0].length;
        
//         for(int i=0;i<rows;i++){
//             for(int j=i+1;j<columns;j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
        int n = matrix.length;
       for(int layer = 0; layer<n/2; layer++){
           int first = layer;
           int last = n-1-layer;
           for(int i= first; i< last; i++){
                int offset = i-first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
           }
       } 
    }
}



//transpose changes rows to columns
//1 2 3        1 4 7
//4 5 6        2 5 8
//7 8 9        3 6 9

