public class Backtracking_N_Queens {
    public static boolean isSafe(char[][] board, int row, int col) {
    // check column
    for (int i = 0; i < row; i++) {
        if (board[i][col] == 'Q') return false;
    }

    // check upper left diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // check upper right diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
}

    public static boolean nQueens(char board[] [] , int row){
        //base case
        if(row == board.length){
           //printBoard(board);
           count++;
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
           board[row][j] ='Q';
           if(nQueens(board, row+1)){// function call
            return true;
           }
            board[row][j]='.'; // backtracking step
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ "");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int count =0;
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        if(nQueens(board , 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("solution is not possible");
        }
       // System.out.println("Total ways to solve n Queens =" + count);

    }
    
}
