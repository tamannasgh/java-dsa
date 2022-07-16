public class KthElementInTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7,9};
        int[] arr2= {1,4,8,10};
        int k = 5;
        System.out.println(kthElement(arr1, arr2, k));
    }

    static int kthElement(int[] arr1, int[] arr2, int k){
        if(arr2.length < arr1.length){
            return kthElement(arr2, arr1, k);
        }

        int s = Math.max(0, k - arr2.length);
        int e = Math.min(k, arr1.length);

        while(s <= e){
            int cut1 = s + (e-s)/2;
            int cut2 = k - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 -1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 -1];
            int r1 = cut1 == arr1.length ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == arr2.length ? Integer.MAX_VALUE : arr2[cut2];

            if(l1 > r2){
                e = cut1 -1;
            } else if(l2 > r1){
                s = cut1 +1;
            } else{
                return Math.max(l1, l2);
            }
        }
        return -1;
    }

}
