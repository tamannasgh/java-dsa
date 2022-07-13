public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        long s = 0;
        long e = nums1.length;

        while(s <= e){
            long cut1 = s + (e-s)/2;
            long cut2 = (nums1.length + nums2.length )/2 - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE :  nums1[(int) cut1-1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[(int) cut2-1];
            int r1 = cut1 == nums1.length ? Integer.MAX_VALUE : nums1[(int) cut1];
            int r2 = cut2 == nums2.length ? Integer.MAX_VALUE : nums2[(int) cut2];

            if(l1 > r2){
                e = cut1 -1;
            }else if(l2 > r1){
                s = cut1 +1;
            }else{
                return (nums1.length + nums2.length) % 2 == 0 ? (float)(Integer.max(l1, l2) + Integer.min(r1, r2)) /2 : Integer.min(r1, r2);

            }
        }
        return -1;
    }
}
