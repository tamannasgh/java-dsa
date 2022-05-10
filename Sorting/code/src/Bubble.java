import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("running "+i+ " loop");
            boolean swapped = false;
            for (int j = 1; j < arr.length-i ; j++) {

                if(arr[j] < arr[j-1]){
                    swapped=true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}