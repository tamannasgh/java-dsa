public class ShipCapacity {
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipCap(arr, days));
    }

    static int shipCap(int[] arr, int days){
        int s = arr[0];
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = Math.max(s, arr[i]);
            e += arr[i];
        }

        while(s < e){
            int mid = s + (e-s)/2;

            if(canBeShipped(arr, mid, days)){
                e = mid;
            } else{
                s = mid +1;
            }
        }
        return s;
    }

    static boolean canBeShipped(int[] arr, int shipCapacity, int actualDays){
        int daysNeed = 1;
        int weight = 0;

        for (int weightOfPackage : arr) {
            if (weight + weightOfPackage > shipCapacity) {
                daysNeed++;
                weight = weightOfPackage;
            } else {
                weight += weightOfPackage;
            }
        }
        return daysNeed <= actualDays;
    }
}
