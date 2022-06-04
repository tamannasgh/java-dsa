public class Prime {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime(n));
        System.out.println(Math.sqrt(n));
    }
    static boolean isPrime(int n){
        for (int i = 2 ; i <= Math.sqrt(n); i++) {
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
}
