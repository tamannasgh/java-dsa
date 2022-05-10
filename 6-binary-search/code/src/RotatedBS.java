public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,7,4,4,4,4,4,4};
        System.out.println(findPivotRandD(arr));
//        System.out.println(rBS(arr, 2));
    }
    static int rBS(int[] arr, int target){
        int pivot = findPivotRandD(arr);

        if(pivot == -1){
            //search in whole because array is not even rotated
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(pivot == target){
            return pivot;
        }
        if(target >= arr[0]){
            //search from 0 index till pivot -1
            return binarySearch(arr, target, 0, pivot-1);
        }
            //search from pivot +1 till arr.length-1
        return binarySearch(arr, target, pivot+1, arr.length-1);

    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid +1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivotR(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid > end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[start] <= arr[mid]){
                //means im(mid) in the rotated part and the element in left side are smaller than me and i know im not pivot because of 1 and 2 checks so now i need to check in right and how can i do that start = mid not mid +1 because its possible that the mid is pivot
                start = mid +1;
            } else{
                end = mid -1;
            }
        }
        return -1;
    }

    static int findPivotRandD(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid -1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                start++;
                end--;
            } else if (arr[start] < arr[mid] || arr[mid] > arr[end]) {
                //means im in rotated part
                start = mid +1;
            } else{
                end = mid -1;
            }
        }
        return -1;
    }


}
