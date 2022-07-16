import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums1) {
            if (binarySearch(nums2, num) != -1) {
                if (!ans.contains(num)) {
                    ans.add(num);
                }  //if unique is asked

            }
        }


        int[] actualAns = new int[ans.size()];
        for(int i = 0 ; i < actualAns.length ; i++){
            actualAns[i] = ans.get(i);
        }

        return actualAns;
    }

    static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while( s <= e){
            int m = s + (e-s)/2;

            if(arr[m] == target){
                return m;
            }
            if(arr[m] > target){
                e = m -1;
            } else{
                s = m+1;
            }
        }
        return -1;
    }

}
