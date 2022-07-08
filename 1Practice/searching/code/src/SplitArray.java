public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int m = 3;
        System.out.println(splitArray(nums, m));
    }

    static int splitArray(int[] nums, int m) {
        int s = nums[0];
        int e =0;
        for(int num: nums){
            s = Math.max(s, num);
            e += num;
        }

        while(s < e){
            int mid = s + (e-s)/2;

            if(condition(nums, mid, m)){   //checking if the sum that I've chosen is splitting the array into <= parts that are allowed?
                e = mid;   //if yes then it does mean if the pieces are equal to the pieces allowed then the main goal was to minimize it, so we need to now try to minimize the sum and how would we do it e =m not m-1 because it's indeed a potential answer, but if it is less than allowed pieces what can be the reason? the sum that we have chosen is large so minimize it so the same thing e = m
            } else{
                s = mid +1;
            }
        }
        return s;
    }

    static boolean condition(int[] nums, int mid, int allowedPieces){
        int sum =0;
        int pieces = 1;
        for(int num : nums){
            if(sum + num <= mid){
                sum += num;
            }else{
                sum = num;
                pieces++;
            }
        }

        return pieces <= allowedPieces;
    }


}
