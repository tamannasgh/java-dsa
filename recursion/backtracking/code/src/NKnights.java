public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, n);
    }

    static void knights(boolean[][] board, int row, int col, int target){
        if (target == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length && col == 0){
            return;
        }

        if(col == board.length){
            knights(board, row +1, 0, target);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            knights(board, row, col +1, target-1);
            board[row][col] = false;
        }
        knights(board, row, col+1, target);
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        if(isOkay(board, row -2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isOkay(board, row -2, col +1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isOkay(board, row -1, col -2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        if(isOkay(board, row -1, col +2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        if(isOkay(board, row +1, col-2)){
            if(board[row+1][col-2]){
                return false;
            }
        }

        if(isOkay(board, row +1, col+2)){
            if(board[row+1][col+2]){
                return false;
            }
        }
        if(isOkay(board, row +2, col-1)){
            if (board[row+2][col-1]){
                return false;
            }
        }

        if(isOkay(board, row+2, col+1)){
            if(board[row +2][col+1]){
                return false;
            }
        }
        return true;
    }

    static boolean isOkay(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board.length;  //will return true or false
    }

    static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean cell : row){
                if(cell){
                    System.out.print("K ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
