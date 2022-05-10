public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        System.out.println(splitArray(arr, 2));
    }
    static int splitArray(int[] arr, int maxPiecesAllowed){
        int start = arr[0];
        int end = 0;

        for (int num: arr){
            start = Math.max(start, num);
            end += num;
        }

        while(start < end){
            int mid = start + (end - start)/2;
            int pieces = 1;
            int sum =0;

            for(int num : arr){
                if(sum + num > mid){
                    pieces++;
                    sum = 0;
                } sum += num;
            }

            if(pieces > maxPiecesAllowed){
                start = mid +1;
            } else{
                end = mid;
            }
        }
        return start; //or return end;
    }
}
