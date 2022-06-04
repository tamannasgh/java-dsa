public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    static boolean isPalindrome(int n){
        return n == rev(n);
    }
    static int rev(int n){
        return revHelper(n, (int)(Math.log10(n)+1));
    }
    static int revHelper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        return n%10 * (int)(Math.pow(10, digits-1)) + revHelper(n/10, digits-1);
    }
}
