public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }

        //if somewhere it hits means the whole array is not sorted doesn't make sense to check the remaining array!
        if(arr[index] > arr[index +1]){
            return false;  //so return false from here to the above calls
        }
        return isSorted(arr, index+1);
    }
}
