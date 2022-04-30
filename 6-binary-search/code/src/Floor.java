public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int target = 4;
        System.out.println(floor(arr, target));
    }
    static int floor(int[] arr, int target){
        //find all the numbers <= target then, find the greatest from those numbers and return

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return end;
    }
}
