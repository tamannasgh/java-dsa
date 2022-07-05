public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }


    static boolean solve(int[][] board){
        int row = -1;
        int col = -1;

        boolean emptyFound = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    emptyFound = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(emptyFound){
                break;
            }
        }

        if(!emptyFound){
            return true;
        }

        for (int num = 1; num <= 9 ; num++) {
            if(isSafe(board, row, col, num)){
                board[row][col] = num;

                if(solve(board)){
                    return true;
                } else{
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }




    static boolean isSafe(int[][] board, int row, int col, int num){

        //checking in the same row for every column
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        //checking in the same column for every row
        for(int[] arr : board){
            if(arr[col] == num){
                return false;
            }
        }

        //checking in the box
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);
        for(int i = rowStart ; i < rowStart + sqrt ; i ++){
            for (int j = colStart ; j < colStart + sqrt ; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board){
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
