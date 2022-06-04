public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 13;
        System.out.printf("%.3f", sqrt(n, 3));
    }
    static double sqrt(int n , int numOfPointPlaces){
        int s = 0;
        int e = n;
        double sRoot = 0;
        while(s <= e){
            int m = s +(e-s)/2;
            if(m*m == n){
                return m;
            }
            if(m*m < n){
                s = m +1;
                sRoot = m;
            } else{
                e = m-1;
            }
        }

        double increment = 0.1;

        for (int i = 0; i < numOfPointPlaces; i++) {
            while(sRoot * sRoot <= n){
                sRoot += increment;
            }
            sRoot -= increment;
            increment /= 10;
        }
        return sRoot;
    }
}
