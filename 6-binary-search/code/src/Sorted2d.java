import java.util.Arrays;

public class Sorted2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(binarySearch(arr, 9)));
    }

    static int[] binarySearch(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }

        if(arr.length == 1){
            return bSInOneRow(arr, target, 0, 0, arr[0].length-1);
        }

        int cols = arr.length-1;
        int rStart = 0;
        int rEnd = arr.length-1;
        int cMid = (arr[0].length-1)/2;

        while(rStart < (rEnd -1)){
            int rMid = rStart + (rEnd - rStart)/2;

            if(target == arr[rMid][cMid]){
                return new int[]{rMid, cMid};
            }
            if(target > arr[rMid][cMid]){
                rStart = rMid;
            } else{
                rEnd = rMid;
            }
        }

        if(target == arr[rStart][cMid]){
            return new int[]{rStart, cMid};
        } if(target == arr[rEnd][cMid]){
            return new int[]{rEnd, cMid};
        }

        if(target <= arr[rStart][cMid -1]){
            return bSInOneRow(arr, target, rStart, 0, cMid-1);
        } if(target >= arr[rStart][cMid +1] && target <= arr[rStart][cols]){
            return bSInOneRow(arr, target, rStart, cMid+1, cols);
        } if(target <= arr[rEnd][cMid-1]){
            return bSInOneRow(arr, target, rEnd, 0, cMid-1);
        } else{
            return bSInOneRow(arr, target, rEnd, cMid+1, cols);
        }

    }

    static int[] bSInOneRow(int[][] arr, int target, int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart)/2;

            if(target == arr[row][cMid]){
                return new int[]{row, cMid};
            }
            if(target > arr[row][cMid]){
                cStart = cMid +1;
            } else{
                cEnd = cMid -1;
            }
        }
        return new int[]{-1, -1};
    }
}
