public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr){
        return findPivotWithDuplicates(arr) +1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                start++;
                end--;
            } else if(arr[start] < arr[mid] || arr[mid] > arr[end]){
                start = mid +1;
            } else{
                end = mid -1;
            }
        }
        return -1;
    }
}
