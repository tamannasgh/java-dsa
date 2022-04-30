import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a num : ");
        int n = scan.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;  //neither prime nor prime
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                System.out.println(i + " divides "+n);
                return false;
            }
        }
        return true;

    }
}
