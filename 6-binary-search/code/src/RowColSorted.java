import java.util.Arrays;

public class RowColSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {6,7,9},
                {12,14,19},
        };
        int[] ans = binarySearch(arr, 2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch(int[][] arr, int target){
        if(arr.length == 1){
            return bSInOneRow(arr, target, 0);
        }

        int row = 0;
        int col = arr[0].length-1;
        while(row < arr.length && col >= 0){
            if(target == arr[row][col]){
                return new int[] {row, col};
            }
            if(target < arr[row][col]){
                col--;
            } else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] bSInOneRow(int[][] arr, int target, int rowNo){
        int start = 0;
        int end = arr[rowNo].length -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(target == arr[rowNo][mid]){
                return new int[]{rowNo, mid};
            }
            if(target > arr[rowNo][mid]){
                start = mid +1;
            } else{
                end = mid -1;
            }
        }
        return new int[] {-1,-1};
    }

}
