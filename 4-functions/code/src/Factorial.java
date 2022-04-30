import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a num : ");
        int n = scan.nextInt();
        System.out.println("factorial of " +n+ " is : " +factorial(n));
    }
    static int factorial(int n){
        int fact= 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}
