public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        System.out.println(find(arr, 3));
    }

    static int find(int[] arr, int target){
        int pivot = peakIndexInMountainArray(arr);
        int ans = binarySearch(arr, target, 0, pivot);
        if(ans != -1){
            return ans;
        } else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start +(end - start)/2;

            if(arr[mid] > arr[mid +1]){
                end= mid;
            } else{
                start = mid +1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            } else{
                if(isAscending){
                    if(target > arr[mid]){
                        start = mid +1;
                    } else{
                        end = mid -1;
                    }
                } else{
                    if(target > arr[mid]){
                        end = mid -1;
                    } else{
                        start = mid +1;
                    }
                }
            }
        }
        return -1;
    }
}
