public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }

    static int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1] < target){
            return nums.length;
        }
        int s = 0;
        int e = nums.length-1;

        while(s < e){
            int m = s+ (e -s)/2;

            if(nums[m] >= target){
                e = m;
            } else{
                s = m +1;
            }
        }
        return s;
    }
}
