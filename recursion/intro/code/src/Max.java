public class Max {
    public static void main(String[] args) {
        int[] arr = {2,3,77,44,5,6};
        System.out.println(max(arr, arr.length-1));
    }
    static int max(int[] arr, int tilIndex){
        if(tilIndex == 0){
            return arr[tilIndex];
        }

        return Math.max(max(arr, tilIndex -1), arr[tilIndex]);
    }

}
