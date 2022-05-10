import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        System.out.println(Arrays.toString(setMisMatch(arr)));
    }
    static int[] setMisMatch(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else{
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return new int[]{arr[j], j+1};
            }
        }
        return new int[]{-1, -1};
    }
}
