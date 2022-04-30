import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(evenOdd(n));
    }

    static boolean evenOdd(int n) {
        return n%2 ==0;
    }
}
