import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,1};
//        bubble(arr, arr.length-1, 0, false);
//        selection(arr, arr.length, 0, 0);
        insertion(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr, int i, int j, boolean swapped){
        if(i == 0){
            return;
        }
        if(j < i){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
            bubble(arr, i, j+1, swapped);
        } else{
            if(!swapped){
               return;
            } bubble(arr, i-1, 0, false);
        }
    }

    static void selection(int[] arr, int i, int j, int max){
        if(i == 0){
            return;
        }

        if(j < i){
            if(arr[j] > arr[max]){
                max = j;
            }
            selection(arr, i, j+1, max);
        } else{
            int temp = arr[i-1];
            arr[i-1] = arr[max];
            arr[max] = temp;

            selection(arr, i-1, 0, 0);
        }
    }

    static void insertion(int[] arr, int i, int j){
        if(j == arr.length){
            return;
        }
        if(j == 0){
            insertion(arr, i+1, i+2);
        }

        if(j > 0){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                insertion(arr, i, j-1);
            }else{
                insertion(arr, i+1, i+2);
            }
        }

    }
}
