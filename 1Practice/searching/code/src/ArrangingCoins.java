public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n) {
        if(n == 1){
            return 1;
        }
        long s = 1;
        long e = n;

        while (s < e) {
            long mid = s + (e - s) / 2;
            long coinsNeeded = (mid * (mid + 1)) / 2;

            if (coinsNeeded <= n) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return (int) s - 1;
    }
}
