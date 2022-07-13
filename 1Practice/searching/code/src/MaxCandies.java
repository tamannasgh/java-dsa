import java.util.Arrays;

public class MaxCandies {
    public static void main(String[] args) {
        int[] candies = {2,7};
        long k = 1;
        System.out.println(maximumCandies(candies, k));
    }

    static int maximumCandies(int[] candies, long k) {
        long s = 1;
        long e = candies[0];

        for(int candiePile : candies){
            e = Math.max(e, candiePile);
        }

        while(s < e){
            long m = s + (e -s)/2;

            if(dividable(candies, m, k)){
                s = m +1;
            } else{
                e = m ;
            }
        }
        return dividable(candies, s, k) ? (int)s: (int)s-1;
    }

    static boolean dividable(int[] candies, long allowedCandies, long askForDividedInto){
        long canBeDividedInto = 0;

        for(int candiePile : candies){
            canBeDividedInto += candiePile/allowedCandies;
        }
        return canBeDividedInto >= askForDividedInto;
    }

}
