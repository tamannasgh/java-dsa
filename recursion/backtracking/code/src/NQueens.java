public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
//        nQueen(board, 0);
        nQueens2(board, 0, 0,n);
    }

    static void nQueen(boolean[][] board, int row){

        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                nQueen(board, row+1);
                board[row][col] = false;
            }
        }
    }


    static void nQueens2(boolean[][] board, int row, int col, int target){
        if(target == 0){
            display(board);
            System.out.println();
            return;
        }
        if(row == 0 && col == board.length){
            return;
        }

        if(col == board.length){
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            nQueens2(board, row +1, 0, target -1);
            board[row][col] = false;
        }

        nQueens2(board, row, col+1, target);
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = 0; i < row ; i++){
            if(board[i][col]){
                return false;
            }
        }

        int maxElementInRight = Math.min(row, col);
        for (int i = 1; i <= maxElementInRight ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxElementInLeft = Math.min(row, board.length-1-col);
        for (int i = 1; i <= maxElementInLeft ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }


    static void display(boolean[][] board){
        for(boolean[] arr: board){
            for(boolean element : arr){
                if(element){
                    System.out.print("Q ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
