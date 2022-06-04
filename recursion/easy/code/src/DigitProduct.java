public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(product(123));
    }
    static int product(int n){
        if(n == 0){
            return 1;
        }
        return n%10 * product(n/10);
    }
}
