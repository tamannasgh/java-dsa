public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rbs(arr, 9, 0, arr.length - 1));
    }
    static int rbs(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e - s) /2;

        if(target == arr[m]){
            return m;
        }

        if(arr[s] <= arr[m]){  //means the first part is sorted
            if(target >= arr[s] && target <= arr[m]){  //checking if the target lies in this range
                return rbs(arr, target, s, m-1);
            } else{
                return rbs(arr, target, m+1, e);
            }
        }
        //means the second part is sorted
        if(target >= arr[m] && target <= arr[e]){
            return rbs(arr,target, m+1, e);
        } return rbs(arr, target, s, m-1);
    }
}
