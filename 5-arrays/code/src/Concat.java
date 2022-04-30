import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(concat(arr)));
    }
    static int[] concat(int[] arr){
        int[] arr2 = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            arr2[arr.length+i] = arr[i];
        }
        return arr2;
    }
}
