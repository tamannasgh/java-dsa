import java.util.Scanner;

public class MaxOfAll {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while(true){
            System.out.println("enter a num : ");
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            if(n > max){
                max = n;
            }
        }
        System.out.println("max is " +max);
    }
}
