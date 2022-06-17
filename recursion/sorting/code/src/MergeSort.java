import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,83,2,1};
//        System.out.println(Arrays.toString(mergesort(arr)));
//        mergesortInPlace(arr, 0, arr.length-1);
        mergesortInPlaceExcludingLast(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));


    }


    static void mergesortInPlaceExcludingLast(int[] arr, int s, int e){
        if(e-s == 1) {
            return;
        }

        int m = s + (e-s) /2;
        mergesortInPlaceExcludingLast(arr, s, m);
        mergesortInPlaceExcludingLast(arr, m, e);

        mergeInPlaceExcludingLast(arr, s, m, e);
    }

    static void mergeInPlaceExcludingLast(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m;
        int k =0;
        int[] mix = new int[e-s];


        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    static void mergesortInPlace(int[] arr, int s, int e){
        if(s == e) {
            return;
        }

        int m = s + (e-s) /2;
        mergesortInPlace(arr, s, m);
        mergesortInPlace(arr, m+1, e);

        mergeInPlace(arr, s, m, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m+1;
        int k =0;
        int[] mix = new int[e-s+1];


        while(i <= m && j <= e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <= e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }


    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergesort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i =0;
        int j =0;
        int k =0;
        int[] mix = new int[first.length + second.length];

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
