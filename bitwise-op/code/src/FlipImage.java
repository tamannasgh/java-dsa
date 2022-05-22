import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ansArr = flipAndInvertImage(arr);
        for(int[] ans : ansArr){
            System.out.println(Arrays.toString(ans));
        }
    }
    static int[][] flipAndInvertImage(int[][] image){
        for(int[] arr: image){
            for (int i = 0; i <( arr.length +1)/2; i++) {
                int temp = arr[i]^1;
                arr[i] = arr[arr.length-1 -i]^1;
                arr[arr.length-1 -i] = temp;
            }
        }
        return image;
    }
}
