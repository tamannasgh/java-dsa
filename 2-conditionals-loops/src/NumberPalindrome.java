import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Find if a number is palindrome or not
        System.out.println("enter a num : ");
        int n = scan.nextInt();
        int original = n;
        int rev = 0;
        while(n > 0){
            rev = (rev * 10) + (n %10);
            n /= 10;
        }
        System.out.println(original == rev);
    }
}
