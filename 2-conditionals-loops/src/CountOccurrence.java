import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 467775745;
        int target = scan.nextInt();
        int count = 0;

        while(n > 0){
            if(n % 10 == target){
                count++;
            }
            n /= 10;
        }

        System.out.println(count);
    }
}
