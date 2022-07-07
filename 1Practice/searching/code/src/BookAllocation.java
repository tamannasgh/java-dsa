public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        System.out.println(bookAlloc(arr, m));
    }

    static int bookAlloc(int[] arr,int m){
        int s = arr[0];
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = Math.max(s, arr[i]);
            e += arr[i];
        }

        while(s < e){
            int mid = s + (e-s)/2;

            int bundles = bundleCreated(arr, mid);

            if(bundles <= m){
                e = mid;
            } else{
                s = mid +1;
            }
        }
        return s;
    }

    static int bundleCreated(int[] arr, int maxPagesAllow){
        int bundle = 1;
        int pagesInBundle = 0;

        for (int pageInBook : arr) {
            if (pagesInBundle + pageInBook > maxPagesAllow) {
                bundle++;
                pagesInBundle = pageInBook;
            } else {
                pagesInBundle += pageInBook;
            }
        }
        return bundle;
    }
}
