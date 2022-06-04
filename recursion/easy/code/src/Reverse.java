public class Reverse {
    public static void main(String[] args) {
//        rev1(1234);
//        System.out.println(rev);
        System.out.println(rev2(1234));
    }

    static int rev = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n %10;
        rev = rev*10 + rem;
        rev1(n/10);
    }

    static int rev2(int n){
        return revHelper(n, (int)(Math.log10(n)+1));
    }
    static int revHelper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        return n%10 * (int)(Math.pow(10, digits-1)) + revHelper(n/10, digits-1);
    }
}
