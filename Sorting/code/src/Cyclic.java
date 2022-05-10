import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i =0;
        while( i < arr.length){
            int correctIndex = arr[i] -1;  //if 1-n and in 0-n arr[i]
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
