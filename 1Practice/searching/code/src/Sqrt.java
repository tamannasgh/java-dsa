public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }

    static int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        long  s= 1;
        long e = x;
        while(s < e){
            long m = s + (e-s)/2;

            if(canBeSqrt(m, x)){
                s = m +1;
            } else{
                e = m;
            }
        }
        return (int)s-1;
    }

    static boolean canBeSqrt(long sqrtN, int n){
        return sqrtN * sqrtN <= n;
    }
}
