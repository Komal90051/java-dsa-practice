public class array_diagonal {
    public static int diagonalSum(int matrix [] []){
        int sum =0;
        //  TIME COMPLEXITY = O(n^2)
        // primary diagonal
       // for(int i=0; i<matrix.length;i++){
         ////   for(int j=0;j<matrix[0].length;j++){
             //   if(i==j){  // primary diagonal
               //     sum += matrix[i][j];
               // }
               // else if( i+j == matrix.length-1){ // secondary diagonal
                 //   sum += matrix[i][j];
               // }
           // }
       // }

       // TIME COMPLEXITY = O(n)    best time complexity
       //int n= matrix.length;
       for(int i=0;i<matrix.length;i++){
        // pd
        sum += matrix[i][i];
        // sd
        if(i != matrix.length-1-i)
        sum += matrix[i][matrix.length-i-1];
       }
        return sum;
    }

       public static void main(String args []){
        int matrix [] [] = {{1,2,3,4,},
                             {5,6,7,8},
                            {9,10,11,12},
                             {13,14,15,16}};
         int result = diagonalSum(matrix);                    ;
         System.out.println("Sum of diagonal :" + result);                   


    }

     
    
}
     