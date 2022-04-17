import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int rev=0;

        while(n > 0){
            rev *= 10;
            rev += n% 10;
            n /= 10;
        }

        System.out.println(rev);

    }
}
