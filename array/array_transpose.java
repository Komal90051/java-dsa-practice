public class array_transpose {
    public static void main(String args []){
        int row = 2 , column = 3;
        int [] [] matrix = {{2,3,7,} ,{5 ,6,7}};

        // Display original matrix 
        printMatrix( matrix);
        // transpose the matrix         // m    n
         int [][] transpose = new int [column ][row];
         for(int i =0 ; i<row ; i++){
            for(int j=0;j<column ; j++){
                transpose [j][i] = matrix[i][j];
            }
         }
         // print the transpose matrix
         printMatrix(transpose); 
    }
    public static void printMatrix(int [][] matrix){
        System.out.println("The matrix is :");
        for(int i=0 ; i<matrix.length;i++ ){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
   // Time complexity = O(n*m) = O(n^2)