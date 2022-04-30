import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] ans = ans(arr, 6);
        System.out.println(Arrays.toString(ans));
    }
    static int[] ans(int [] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = fnLP(nums, target, true);
        if(ans[0] != -1){
            ans[1] = fnLP(nums, target, false);
        }
        return ans;
    }
    static int fnLP(int[] arr, int target, boolean findingFirstPosition){
        int start =0;
        int end = arr.length -1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end =  mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else{
                ans = mid;
                if(findingFirstPosition){
                    end = mid -1;
                } else{
                    start = mid +1;
                }
            }
        }
       return ans;
    }
}
