public class Sieve {
    public static void main(String[] args) {
        int n = 13;
        boolean[] isNotPrime = new boolean[n + 1]; //because we want 13 too! and we count from 0.
        allPrimesTil(n, isNotPrime);
    }

    static void allPrimesTil(int n, boolean[] isNotPrime){
        for (int i = 2; i*i < n ; i++) {
            if(!isNotPrime[i]){   //isNotPrime false means it's prime and til now no number can divide it because from starting we are making true all the multiples of i
                for (int j = i*2; j < isNotPrime.length ; j += i) {
                    isNotPrime[j] = true; //yes, it's not prime
                }
            }
        }

        for (int i = 2; i < isNotPrime.length; i++) {
            if(!isNotPrime[i]){
                System.out.print(i +" ");
            }
        }
    }
}
