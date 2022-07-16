public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(searchMatrix(arr, 9));
    }

    static  boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = matrix.length-1;
        if(matrix.length == 1 && matrix[0].length == 0){
            return false;
        }
        if(matrix.length == 1){
            return binarySearch(matrix[0], target);
        }

        while(s < (e-1)) {
            int m = s + (e - s) / 2;

            if (matrix[m][0] == target) {
                return true;
            }
            if (matrix[m][0] < target) {
                s = m;
            } else {
                e = m;
            }
        }

        boolean result = binarySearch(matrix[s], target);
        if(result){
            return result;
        } return binarySearch(matrix[e], target);
    }

    static boolean binarySearch(int[] row, int target){
        int s = 0;
        int e = row.length-1;

        while(s <= e){
            int m = s + (e-s)/2;

            if(row[m] == target){
                return true;
            }
            if(row[m] > target){
                e = m-1;
            } else{
                s = m+1;
            }
        }
        return false;
    }
}
